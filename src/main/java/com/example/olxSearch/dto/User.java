package com.example.olxSearch.dto;

public class User {
    private long id;
    private String created;
    private boolean other_ads_enabled;
    private String name;
    private Object logo;
    private Object logo_ad_page;
    private Object social_network_account_type;
    private Object photo;
    private String banner_mobile;
    private String banner_desktop;
    private String company_name;
    private String about;
    private boolean b2c_business_page;
    private boolean is_online;
    private String last_seen;
    private Object seller_type;
    private String uuid;

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public boolean isOther_ads_enabled() {
        return other_ads_enabled;
    }

    public void setOther_ads_enabled(boolean other_ads_enabled) {
        this.other_ads_enabled = other_ads_enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public Object getLogo_ad_page() {
        return logo_ad_page;
    }

    public void setLogo_ad_page(Object logo_ad_page) {
        this.logo_ad_page = logo_ad_page;
    }

    public Object getSocial_network_account_type() {
        return social_network_account_type;
    }

    public void setSocial_network_account_type(Object social_network_account_type) {
        this.social_network_account_type = social_network_account_type;
    }

    public Object getPhoto() {
        return photo;
    }

    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    public String getBanner_mobile() {
        return banner_mobile;
    }

    public void setBanner_mobile(String banner_mobile) {
        this.banner_mobile = banner_mobile;
    }

    public String getBanner_desktop() {
        return banner_desktop;
    }

    public void setBanner_desktop(String banner_desktop) {
        this.banner_desktop = banner_desktop;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public boolean isB2c_business_page() {
        return b2c_business_page;
    }

    public void setB2c_business_page(boolean b2c_business_page) {
        this.b2c_business_page = b2c_business_page;
    }

    public boolean isIs_online() {
        return is_online;
    }

    public void setIs_online(boolean is_online) {
        this.is_online = is_online;
    }

    public String getLast_seen() {
        return last_seen;
    }

    public void setLast_seen(String last_seen) {
        this.last_seen = last_seen;
    }

    public Object getSeller_type() {
        return seller_type;
    }

    public void setSeller_type(Object seller_type) {
        this.seller_type = seller_type;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", created='" + created + '\'' +
                ", other_ads_enabled=" + other_ads_enabled +
                ", name='" + name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", about='" + about + '\'' +
                ", last_seen='" + last_seen + '\'' +
                '}';
    }
}