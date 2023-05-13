package com.virendra.service;

import com.virendra.model.Phone;

import java.util.HashMap;
import java.util.Map;

public class MobilePhoneService {

    private Map<String, Phone> phones;

    public MobilePhoneService() {
        phones = new HashMap<String, Phone>();
        phones.put("Samsung Galaxy S9", new Phone("Samsung Galaxy S9"));
        phones.put("Samsung Galaxy S8-1", new Phone("Samsung Galaxy S8"));
        phones.put("Samsung Galaxy S8-2", new Phone("Samsung Galaxy S8"));
        phones.put("Motorola Nexus 6", new Phone("Motorola Nexus 6"));
        phones.put("Oneplus 9", new Phone("Oneplus 9"));
        phones.put("Apple iPhone 13", new Phone("Apple iPhone 13"));
        phones.put("Apple iPhone 12", new Phone("Apple iPhone 12"));
        phones.put("Apple iPhone 11", new Phone("Apple iPhone 11"));
        phones.put("iPhone X", new Phone("iPhone X"));
        phones.put("Nokia 3310", new Phone("Nokia 3310"));
    }

    public void bookPhone(String phoneName, String bookedBy) {
        Phone phone = phones.get(phoneName);
        if (phone != null && phone.isAvailable()) {
            phone.book(bookedBy);
        }
    }

    public void returnPhone(String phoneName) {
        Phone phone = phones.get(phoneName);
        if (phone != null && !phone.isAvailable()) {
            phone.returnPhone();
        }
    }

    public void printPhoneAvailability() {
        System.out.println("Phone Name\tAvailability\tBooked By\tLast Booked At");
        for (Phone phone : phones.values()) {
            System.out.println(phone.getName() + "\t" + phone.isAvailable() + "\t" + phone.getBookedBy() + "\t" + phone.getLastBookedAt());
        }
    }

}
