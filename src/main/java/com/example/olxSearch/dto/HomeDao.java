package com.example.olxSearch.dto;


import java.util.List;
import java.util.Objects;

public class HomeDao {
    public HomeDao() {
    }

    public HomeDao(String _id, long id, String url, String title, String last_refresh_time, String created_time, String valid_to_time, String pushup_time, String description, Promotion promotion, List<Parameter> params, List<String> key_params, boolean business, User user, String status, Contact contact, Map map, Location location, List<Photo> photos, Object partner, Category category, Delivery delivery, SafeDeal safedeal, Shop shop, String offer_type) {
        this._id = _id;
        this.id = id;
        this.url = url;
        this.title = title;
        this.last_refresh_time = last_refresh_time;
        this.created_time = created_time;
        this.valid_to_time = valid_to_time;
        this.pushup_time = pushup_time;
        this.description = description;
        this.promotion = promotion;
        this.params = params;
        this.key_params = key_params;
        this.business = business;
        this.user = user;
        this.status = status;
        this.contact = contact;
        this.map = map;
        this.location = location;
        this.photos = photos;
        this.partner = partner;
        this.category = category;
        this.delivery = delivery;
        this.safedeal = safedeal;
        this.shop = shop;
        this.offer_type = offer_type;
    }

    private String _id;
    private long id;
    private String url;
    private String title;
    private String last_refresh_time;
    private String created_time;
    private String valid_to_time;
    private String pushup_time;
    private String description;
    private Promotion promotion;
    private List<Parameter> params;
    private List<String> key_params;
    private boolean business;
    private User user;
    private String status;
    private Contact contact;
    private Map map;
    private Location location;
    private List<Photo> photos;
    private Object partner;
    private Category category;
    private Delivery delivery;
    private SafeDeal safedeal;
    private Shop shop;
    private String offer_type;

    // getters and setters

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLast_refresh_time() {
        return last_refresh_time;
    }

    public void setLast_refresh_time(String last_refresh_time) {
        this.last_refresh_time = last_refresh_time;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getValid_to_time() {
        return valid_to_time;
    }

    public void setValid_to_time(String valid_to_time) {
        this.valid_to_time = valid_to_time;
    }

    public String getPushup_time() {
        return pushup_time;
    }

    public void setPushup_time(String pushup_time) {
        this.pushup_time = pushup_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public List<Parameter> getParams() {
        return params;
    }

    public void setParams(List<Parameter> params) {
        this.params = params;
    }

    public List<String> getKey_params() {
        return key_params;
    }

    public void setKey_params(List<String> key_params) {
        this.key_params = key_params;
    }

    public boolean isBusiness() {
        return business;
    }

    public void setBusiness(boolean business) {
        this.business = business;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Object getPartner() {
        return partner;
    }

    public void setPartner(Object partner) {
        this.partner = partner;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public SafeDeal getSafedeal() {
        return safedeal;
    }

    public void setSafedeal(SafeDeal safedeal) {
        this.safedeal = safedeal;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getOffer_type() {
        return offer_type;
    }

    public void setOffer_type(String offer_type) {
        this.offer_type = offer_type;
    }

    @Override
    public String toString() {
        return "AdvertisementDocument{" +
                "_id='" + _id + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
//                ", created_time='" + created_time + '\'' +
//                ", description='" + description + '\'' +
//                ", promotion=" + promotion +
//                ", params=" + params +
//                ", key_params=" + key_params +
//                ", business=" + business +
//                ", user=" + user +
//                ", status='" + status + '\'' +
//                ", map=" + map +
//                ", location=" + location +
//                ", photos=" + photos +
//                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeDao myClass = (HomeDao) o;
        return id == myClass.id && Objects.equals(url, myClass.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url);
    }

}
