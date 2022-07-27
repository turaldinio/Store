package com.guluev.main.java.Store.View;

import com.guluev.main.java.Product.Model.Product;

import java.util.List;

public class StoreViewImpl implements StoreView {
    @Override
    public void printList(List<Product> list) {
        System.out.println(list.toString().substring(1, list.toString().length() - 1));

    }
}
