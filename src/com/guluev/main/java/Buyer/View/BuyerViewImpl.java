package Buyer.View;

import Product.Product;

import java.util.List;

public class BuyerViewImpl implements BuyertView {

    public void printList(List<Product> list) {
        System.out.println(list.toString().substring(1, list.toString().length() - 1));

    }
}
