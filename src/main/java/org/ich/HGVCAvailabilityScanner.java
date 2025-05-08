package org.ich;

import io.github.cdimascio.dotenv.Dotenv;

import static org.ich.HGVCInteractor.ResortId.VALDORO_RESORT_ID;

public class HGVCAvailabilityScanner {

    public static void main(String[] args) {
        // Setup Environment
        Dotenv dotenv = Dotenv.configure().load();
        final String hgvUsername = dotenv.get("HGVC_USERNAME");
        final String hgvPassword = dotenv.get("HGVC_PASSWORD");

        if (hgvUsername == null || hgvPassword == null) {
            throw new RuntimeException("HGVC_USERNAME and HGVC_PASSWORD environment variables must be set");
        }

        HGVCInteractor hgvcInteractor = new HGVCInteractor(hgvUsername, hgvPassword);

        hgvcInteractor.printAvailability(
                hgvcInteractor.getAvailability(VALDORO_RESORT_ID.getUuid(), 0, 276));

        hgvcInteractor.printAvailability(
                hgvcInteractor.getAvailability(VALDORO_RESORT_ID.getUuid(), 276, 365));

        // Clean-up
        hgvcInteractor.close();
    }
}