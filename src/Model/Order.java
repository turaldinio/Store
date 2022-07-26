package Model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Order {
    private List<Product> basket=new ArrayList<>();


    public void putInBasket(Product product) {
        basket.add(product);
        System.out.println("Сумма товаров в корзине: "+currentBasketSum());
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
