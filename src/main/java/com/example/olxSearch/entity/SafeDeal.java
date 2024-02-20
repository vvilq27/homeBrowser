package com.example.olxSearch.entity;

import java.util.List;

public class SafeDeal {
    private int weight;
    private int weight_grams;
    private String status;
    private boolean safedeal_blocked;
    private List<Object> allowed_quantity;

    // getters and setters

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight_grams() {
        return weight_grams;
    }

    public void setWeight_grams(int weight_grams) {
        this.weight_grams = weight_grams;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSafedeal_blocked() {
        return safedeal_blocked;
    }

    public void setSafedeal_blocked(boolean safedeal_blocked) {
        this.safedeal_blocked = safedeal_blocked;
    }

    public List<Object> getAllowed_quantity() {
        return allowed_quantity;
    }

    public void setAllowed_quantity(List<Object> allowed_quantity) {
        this.allowed_quantity = allowed_quantity;
    }
}