package Model;


import java.util.List;
import java.util.stream.DoubleStream;

public class Order {
    private List<Product> basket;
    private double sum;

    public void pushInBasket(Product product) {
        basket.add(product);
        System.out.println(currentBasketSum());
    }

    public double currentBasketSum() {
        return basket.stream()
                .flatMapToDouble(x -> DoubleStream.of(x.getPrice()))
                .sum();
    }


    public boolean toPay(double wallet) {
        if (wallet < currentBasketSum()) {
            return false;
        }
        return true;
    }

}
