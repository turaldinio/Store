package com.guluev.main.java.Product.Model;

import com.google.gson.Gson;

public abstract class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        setRating(rating);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating > 10) {
            System.out.println("Рейтинг товара " + getName() + " не может иметь значения больше 10.Ему выставлено def значение 0");
            return;
        }
        this.rating = rating;

    }

    public String productToJson() {


    }

    public String getFullInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Название").append(getName()).append("\n").
                append("Цена:").append(getPrice()).append("\n")
                .append("Рейтинг:").append(getRating());
        return stringBuilder.toString();
    }


    @Override
    public String toString() {
        return getName();
    }
}
