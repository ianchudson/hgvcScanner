package org.ich;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.RequestOptions;
import org.ich.models.Availability;
import org.ich.models.HgvcAvailability;
import org.ich.models.Room;

import java.time.temporal.ChronoUnit;

public class HGVCInteractor {
    // HGVC URLs
    private static final String HGVC_LOGIN_URL = "https://club.hiltongrandvacations.com/en/login";
    private static final String HGVC_AVAILABILITY_URL = "https://club.hiltongrandvacations.com/api/availability/resort/";

    // Minimum Stay Days
    private static final int MINIMUM_STAY_NIGHTS = 3;

    public enum ResortId {
        VALDORO_RESORT_ID("db244738-f564-4639-aa4f-74b88186d82f");

        private final String uuid;

        ResortId(String uuid) {
            this.uuid = uuid;
        }

        public String getUuid() {
            return uuid;
        }
    }

    // Persistent Browser
    private final Playwright playwright;
    private Browser browser;

    public HGVCInteractor(String hgvUsername, String hgvPassword) {
        this.playwright = Playwright.create();
        // Establish Browser Connection to Login
        createBrowserSession(hgvUsername, hgvPassword);
    }

    // Close Browser Session and Playwright
    public void close() {
        if (this.browser != null) {
            this.browser.close();
        }
        if (this.playwright != null) {
            this.playwright.close();
        }
    }

    // Create Browser Session and Login
    private void createBrowserSession(String username, String password) {
        this.browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(250));
        BrowserContext context = browser.newContext();
        Page page = context.newPage();

        // Login
        System.out.println("Logging in");
        page.navigate(HGVC_LOGIN_URL);
        System.out.println("Waiting for login page");
        page.waitForURL("**/signin**");

        System.out.println("Filling in credentials");
        page.locator("#Username").fill(username);
        page.locator("#Password").fill(password);
        page.locator("button[type=button]").getByText("Sign In").click();

        System.out.println("Waiting for dashboard");
        page.waitForURL("**/dashboard**");
    }

    // HgvcAvailability JSON for Use
    public HgvcAvailability getAvailability(String resortId, int startDateOffset, int endDateOffset) {

        HgvcAvailability hgvcAvailability;

        try {
            System.out.println("Getting availability");
            String requestUrl = HGVC_AVAILABILITY_URL + resortId;

            APIResponse response = this.browser.contexts().get(0).request().get(requestUrl,
                    RequestOptions.create()
                            .setQueryParam("lang", "en")
                            .setQueryParam("start", calculateOffsetDate(startDateOffset))
                            .setQueryParam("end", calculateOffsetDate(endDateOffset))
                            .setQueryParam("ada", "false"));

            if (!response.ok()) {
                throw new RuntimeException("API returned status code " + response.status());
            }

            // Parse JSON into Object
            ObjectMapper mapper = new ObjectMapper();
            hgvcAvailability = mapper.readValue(response.text(), HgvcAvailability.class);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return hgvcAvailability;
    }

    public void printAvailability(HgvcAvailability hgvcAvailability) {
        for (Room room : hgvcAvailability.getRooms()) {
            System.out.println(room.getUnit());
            String startingDate = null;
            for (Availability availability : room.getAvailability()) {
                // Stay Available - Haven't Started Iterating
                if ( availability.getP() != null && startingDate == null ) {
                    startingDate = availability.getDate();
                }
                // No Stay Available - We Started Counting
                else if ( availability.getP() == null && startingDate != null ) {
                    int dateDiff = dateDifference(startingDate, availability.getDate());
                    if (dateDiff >= MINIMUM_STAY_NIGHTS ) {
                        System.out.println(startingDate + " - " + availability.getDate() + " (" + dateDiff + " nights) : Start Watching on " + calculateBookingDate(startingDate));
                    }
                    startingDate = null;
                }
            }
            System.out.println("-------------------------------");
        }
    }

    // Function that returns the date 276 days before the provided date
    private String calculateBookingDate(String startDate) {
        java.time.LocalDate startDateObj = java.time.LocalDate.parse(startDate);
        java.time.LocalDate bookingDate = startDateObj.minusDays(276);
        return bookingDate.toString();
    }

    // LocalDate for days from now
    private String calculateOffsetDate(int i) {
        java.time.LocalDate now = java.time.LocalDate.now();
        java.time.LocalDate offsetDate = now.plusDays(i);
        return offsetDate.toString();
    }

    // Find the difference between two dates
    private int dateDifference(String startDate, String endDate) {
        java.time.LocalDate startDateObj = java.time.LocalDate.parse(startDate);
        java.time.LocalDate endDateObj = java.time.LocalDate.parse(endDate);
        return Math.toIntExact(ChronoUnit.DAYS.between(startDateObj, endDateObj));
    }
}
