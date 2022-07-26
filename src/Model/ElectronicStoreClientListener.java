package Model;


import Interfaces.WorkingWithTheProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class ElectronicStoreClientListener implements WorkingWithTheProduct {
    private List<Product> basket = new ArrayList<>();

    @Override
    public void addProductInBasket(Product product) {
        basket.add(product);
        System.out.println("Сумма товаров в корзине: " + calculateTheAmount());

    }

    @Override
    public double calculateTheAmount() {
        return basket.stream()
                .flatMapToDouble(x -> DoubleStream.of(x.getPrice()))
                .sum();

    }

    @Override
    public boolean toPay(double wallet) {
        if (wallet < calculateTheAmount()) {
            return false;
        }
        return true;
    }

}

