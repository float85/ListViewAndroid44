package com.vactuvahangtong.listviewdemo44;

public class Product {
    String name;
    String numberPhone;
    String email;
    boolean avataUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAvataUser() {
        return avataUser;
    }

    public void setAvataUser(boolean avataUser) {
        this.avataUser = avataUser;
    }

    public Product(String name, String numberPhone, String email, boolean avataUser) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.email = email;
        this.avataUser = avataUser;
    }
}
