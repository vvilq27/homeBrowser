package com.example.olxSearch.dto;

public class Contact {
    private String name;
    private boolean phone;
    private boolean chat;
    private boolean negotiation;
    private boolean courier;

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPhone() {
        return phone;
    }

    public void setPhone(boolean phone) {
        this.phone = phone;
    }

    public boolean isChat() {
        return chat;
    }

    public void setChat(boolean chat) {
        this.chat = chat;
    }

    public boolean isNegotiation() {
        return negotiation;
    }

    public void setNegotiation(boolean negotiation) {
        this.negotiation = negotiation;
    }

    public boolean isCourier() {
        return courier;
    }

    public void setCourier(boolean courier) {
        this.courier = courier;
    }
}