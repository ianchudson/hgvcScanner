package org.ich;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.*;
import io.github.cdimascio.dotenv.Dotenv;
import org.ich.models.Availability;
import org.ich.models.HgvcAvailability;
import org.ich.models.Room;

public class Main {
    public static void main(String[] args) {
        // Setup Environment
        Dotenv dotenv = Dotenv.configure().load();
        final String hgvUsername = dotenv.get("HGVC_USERNAME");
        final String hgvPassword = dotenv.get("HGVC_PASSWORD");

        final String HGV_LOGIN_URL = "https://club.hiltongrandvacations.com/en/login";
        final String VALDORO_AVAILABILITY_URL = "https://club.hiltongrandvacations.com/api/availability/resort/db244738-f564-4639-aa4f-74b88186d82f?lang=en&start=2026-01-01&end=2026-03-31&ada=false";

        if (hgvUsername == null || hgvPassword == null) {
            throw new RuntimeException("HGVC_USERNAME and HGVC_PASSWORD environment variables must be set");
        }

        // Setup Playwright
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium()
                    .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(250));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            // Login
            System.out.println("Logging in");
            page.navigate(HGV_LOGIN_URL);
            System.out.println("Waiting for login page");
            page.waitForURL("**/signin**");

            System.out.println("Filling in credentials");
            page.locator("#Username").fill(hgvUsername);
            page.locator("#Password").fill(hgvPassword);
            page.locator("button[type=button]").getByText("Sign In").click();

            System.out.println("Waiting for dashboard");
            page.waitForURL("**/dashboard**");

            System.out.println("Getting availability");
            APIResponse response = context.request().get(VALDORO_AVAILABILITY_URL);

            if (!response.ok()) {
                throw new RuntimeException("API returned status code " + response.status());
            }

            ObjectMapper mapper = new ObjectMapper();
            HgvcAvailability hgvcAvailability = mapper.readValue(response.text(), HgvcAvailability.class);

            for (Room room : hgvcAvailability.getRooms()) {
                System.out.println(room.getUnit());
                for (Availability availability : room.getAvailability()) {
                    if(availability.getP() != null) {
                        System.out.println(availability.getDate() + " " + availability.getP());
                    }
                }
                System.out.println("-------------------------------");
            }


            // Close
            context.close();
            browser.close();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}