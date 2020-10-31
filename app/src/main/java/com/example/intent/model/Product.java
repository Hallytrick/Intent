package com.example.intent.model;

public class Product {
    private String title;
    private int image;
    private String type;
    private double price;

    public Product(String title, int image, String type, double price) {
        this.title = title;
        this.image = image;
        this.type = type;
        this.price = price;
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
}
