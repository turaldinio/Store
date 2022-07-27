package Store;


import Interfaces.WorkingWithTheBasket;
import Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class ElectronicStoreWorkingWithBasketImpl implements WorkingWithTheBasket {
    private List<Product> basket = new ArrayList<>();

    @Override
    public void addProductInBasket(Product product) {
        basket.add(product);
        System.out.println("Сумма товаров в корзине: " + calculateTheAmountInBasket());

    }

    @Override
    public double calculateTheAmountInBasket() {
        return basket.stream()
                .flatMapToDouble(x -> DoubleStream.of(x.getPrice()))
                .sum();

    }


}

