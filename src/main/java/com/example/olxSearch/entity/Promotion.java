package com.example.olxSearch.entity;

import java.util.List;

public class Promotion {
    public Promotion() {
    }

    private boolean highlighted;
    private boolean urgent;
    private boolean top_ad;
    private List<String> options;
    private boolean b2c_ad_page;
    private boolean premium_ad_page;

    // getters and setters

    public boolean isHighlighted() {
        return highlighted;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isTop_ad() {
        return top_ad;
    }

    public void setTop_ad(boolean top_ad) {
        this.top_ad = top_ad;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public boolean isB2c_ad_page() {
        return b2c_ad_page;
    }

    public void setB2c_ad_page(boolean b2c_ad_page) {
        this.b2c_ad_page = b2c_ad_page;
    }

    public boolean isPremium_ad_page() {
        return premium_ad_page;
    }

    public void setPremium_ad_page(boolean premium_ad_page) {
        this.premium_ad_page = premium_ad_page;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "highlighted=" + highlighted +
                ", urgent=" + urgent +
                ", top_ad=" + top_ad +
                ", options=" + options +
                ", premium_ad_page=" + premium_ad_page +
                '}';
    }
}