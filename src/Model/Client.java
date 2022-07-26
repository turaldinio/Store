package Model;

import Interfaces.WorkingWithPayment;
import Interfaces.WorkingWithTheBasket;

public class Client {
    private final String name;
    private final double wallet;
    private final WorkingWithTheBasket basket;

    public Client(String name, double wallet, WorkingWithTheBasket working) {
        this.name = name;
        this.wallet = wallet;
        this.basket = working;
    }


    public void putInBasket(Product product) {
        basket.addProductInBasket(product);
    }



    public void toPay(WorkingWithPayment payment) {
        if (payment.pay(wallet, basket.calculateTheAmountInBasket())) {
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

    public WorkingWithTheBasket getWorking() {
        return basket;
    }
}
