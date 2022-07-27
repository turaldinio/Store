package com.guluev.main.java.Product.Controller;

import com.guluev.main.java.Product.Model.Product;
import com.guluev.main.java.Product.View.View;

public class ProductController {
    private Product product;
    private View view;

    public ProductController(Product product, View view) {
        this.product = product;
        this.view = view;
    }

    public String getName() {
        return product.getName();
    }

    public double getPrice() {
        return product.getPrice();
    }

    public double getRating() {
        return product.getRating();
    }

    public void setRating(double rating) {
        product.setRating(rating);
    }

    public String getFulInfo() {
        return product.getFullInfo();
    }

    public void updateView() {
        view.printInfo();
    }


}

