package Buyer.View;

import Store.Model.Product;

import java.util.List;

public class BuyerViewImpl implements BuyertView {
    @Override
    public void printList(List<Product> list) {
        System.out.println(list.toString().substring(1, list.toString().length() - 1));

    }
}
