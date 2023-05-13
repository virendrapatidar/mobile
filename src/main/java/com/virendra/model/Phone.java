package com.virendra.model;

public class Phone {

    private String name;
    private boolean available;
    private String bookedBy;
    private long lastBookedAt;

    public Phone(String name) {
        this.name = name;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public long getLastBookedAt() {
        return lastBookedAt;
    }

    public void book(String bookedBy) {
        this.bookedBy = bookedBy;
        this.lastBookedAt = System.currentTimeMillis();
        this.available = false;
    }

    public void returnPhone() {
        this.bookedBy = null;
        this.lastBookedAt = 0;
        this.available = true;
    }

}