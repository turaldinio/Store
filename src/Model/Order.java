package Model;

import java.util.List;
import java.util.stream.DoubleStream;

public class Order {
    private List<Product> basket;
    private double sum;


    public void addProductInBasket(Product product) {
        basket.add(product);
    }

    public double currentBasketSum() {
        return basket.stream().flatMapToDouble(x -> DoubleStream.of(x.getPrice())).sum();
    }

}
