package Buyer.Model;


import Buyer.Interfaces.WorkingWithPayment;
import Buyer.Interfaces.WorkingWithTheBasket;
import Product.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public abstract class Buyer {
    private final String name;
    private final double wallet;
    private List<Product> basket;

    public Buyer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.basket = new ArrayList<>();
    }


    public void putInBasket(Product product) {
        basket.add(product);
    }

    public double currentBasketSum() {
        WorkingWithTheBasket basketWorking = () -> {
            return basket.stream().flatMapToDouble(x -> DoubleStream.of(x.getPrice())).sum();
        };
        return basketWorking.calculateTheAmountInBasket();
    }

    public void toPay(double currentAmount) {

        WorkingWithPayment payment = (wallet) -> {
            return wallet >= currentAmount;
        };
        if (payment.pay(wallet)) {
            System.out.println("Оплата прошла успешно.Приходите еще!");
        } else {
            System.out.println("Недостаточно средств для оплаты");

        }
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public List<Product> getBasket() {
        return basket;
    }
}
