package com.example.intent.model;

public class Product {
    private String title;
    private int image;
    private String type;
    private double price;
    private String description;
    private int serialNo;

    public Product(String title, int image, String type, double price, String description, int serialNo) {
        this.title = title;
        this.image = image;
        this.type = type;
        this.price = price;
        this.description = description;
        this.serialNo = serialNo;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
