package Interfaces;

import Model.Product;

public interface WorkingWithTheProduct {

    void addProductInBasket(Product product);

    double calculateTheAmount();

    boolean toPay(double wallet);

}
