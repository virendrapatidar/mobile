package com.virendra;

import com.virendra.service.FonoService;
import com.virendra.service.MobilePhoneService;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        // Call Methods to bookPhone and returnPhone
        MobilePhoneService mobilePhoneService = new MobilePhoneService();
        mobilePhoneService.bookPhone("Samsung Galaxy S9", "John");
        mobilePhoneService.bookPhone("Samsung Galaxy S8-1", "Alice");
        mobilePhoneService.returnPhone("Samsung Galaxy S8-1");
        mobilePhoneService.bookPhone("Motorola Nexus 6", "Bob");
        mobilePhoneService.printPhoneAvailability();

        // Call FonoAPI service for one device
        String deviceName = "Samsung Galaxy S9";
        FonoService fonoService = new FonoService();
        try {
            System.out.println(fonoService.getPhoneDetails(deviceName));
        } catch (IOException exception) {
            System.out.println("Cannot fetch details for " + deviceName);
        }
    }


}
