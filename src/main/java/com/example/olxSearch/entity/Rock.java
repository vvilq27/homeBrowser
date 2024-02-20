package com.example.olxSearch.entity;

public class Rock {
    private Object offer_id;
    private boolean active;
    private String mode;

    // getters and setters

    public Object getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(Object offer_id) {
        this.offer_id = offer_id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}