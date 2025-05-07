package org.ich;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.RequestOptions;
import io.github.cdimascio.dotenv.Dotenv;
import org.ich.models.Availability;
import org.ich.models.HgvcAvailability;
import org.ich.models.Room;

import java.time.temporal.ChronoUnit;

public class HGVCAvailabilityScanner {
    private static final String HGVC_LOGIN_URL = "https://club.hiltongrandvacations.com/en/login";

    // Complete URL Example
    // https://club.hiltongrandvacations.com/api/availability/resort/db244738-f564-4639-aa4f-74b88186d82f?lang=en&start=2026-01-01&end=2026-03-31&ada=false
    private static final String HGVC_AVAILABILITY_URL = "https://club.hiltongrandvacations.com/api/availability/resort/";
    private static final String VALDORO_RESORT_ID = "db244738-f564-4639-aa4f-74b88186d82f";
    private static final int VALDORO_MINIMUM_STAY_DAYS = 3;

    public static void main(String[] args) {
        // Setup Environment
        Dotenv dotenv = Dotenv.configure().load();
        final String hgvUsername = dotenv.get("HGVC_USERNAME");
        final String hgvPassword = dotenv.get("HGVC_PASSWORD");

        if (hgvUsername == null || hgvPassword == null) {
            throw new RuntimeException("HGVC_USERNAME and HGVC_PASSWORD environment variables must be set");
        }

        HgvcAvailability hgvcAvailability;

        hgvcAvailability = getAvailability(hgvUsername, hgvPassword, VALDORO_RESORT_ID,
                calculateOffsetDate(0), calculateOffsetDate(276));

        printAvailability(hgvcAvailability, "Available Bookings for ");

        // TODO: Improve browser reuse and close after program termination to prevent logging in twice
        hgvcAvailability = getAvailability(hgvUsername, hgvPassword, VALDORO_RESORT_ID,
                calculateOffsetDate(276), calculateOffsetDate(365));

        printAvailability(hgvcAvailability, "Future Bookings for ");

    }

    private static void printAvailability(HgvcAvailability hgvcAvailability, String message) {
        for (Room room : hgvcAvailability.getRooms()) {
            System.out.println(message + room.getUnit());
            String startingDate = null;
            for (Availability availability : room.getAvailability()) {
                // Stay Available - Haven't Started Iterating
                if ( availability.getP() != null && startingDate == null ) {
                    startingDate = availability.getDate();
                }
                // No Stay Available - We Started Counting
                else if ( availability.getP() == null && startingDate != null ) {
                    int dateDiff = dateDifference(startingDate, availability.getDate());
                    if (dateDiff >= VALDORO_MINIMUM_STAY_DAYS ) {
                        System.out.println(startingDate + " - " + availability.getDate() + " (" + dateDiff + " nights) : Start Watching on " + calculateBookingDate(startingDate));
                    }
                    startingDate = null;
                }
            }
            System.out.println("-------------------------------");
        }
    }

    // Function that returns the date 276 days before the provided date
    private static String calculateBookingDate(String startDate) {
        java.time.LocalDate startDateObj = java.time.LocalDate.parse(startDate);
        java.time.LocalDate bookingDate = startDateObj.minusDays(276);
        return bookingDate.toString();
    }

    // LocalDate for days from now
    private static String calculateOffsetDate(int i) {
        java.time.LocalDate now = java.time.LocalDate.now();
        java.time.LocalDate offsetDate = now.plusDays(i);
        return offsetDate.toString();
    }

    // Find the difference between two dates
    private static int dateDifference(String startDate, String endDate) {
        java.time.LocalDate startDateObj = java.time.LocalDate.parse(startDate);
        java.time.LocalDate endDateObj = java.time.LocalDate.parse(endDate);
        return Math.toIntExact(ChronoUnit.DAYS.between(startDateObj, endDateObj));
    }

    // Login to HGVC and Fetch HgvcAvailability JSON for Use
    private static HgvcAvailability getAvailability(String username, String password, String resortId, String startDate, String endDate) {

        HgvcAvailability hgvcAvailability;

        // Setup Playwright
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium()
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

            System.out.println("Getting availability");
            String requestUrl = HGVC_AVAILABILITY_URL + resortId;

            APIResponse response = context.request().get(requestUrl,
                    RequestOptions.create()
                            .setQueryParam("lang", "en")
                            .setQueryParam("start", startDate)
                            .setQueryParam("end", endDate)
                            .setQueryParam("ada", "false"));

            if (!response.ok()) {
                throw new RuntimeException("API returned status code " + response.status());
            }

            // Parse JSON into Object
            ObjectMapper mapper = new ObjectMapper();
            hgvcAvailability = mapper.readValue(response.text(), HgvcAvailability.class);

            // Close
            context.close();
            browser.close();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        return hgvcAvailability;
    }
}