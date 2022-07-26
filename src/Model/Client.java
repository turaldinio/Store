package Model;

import Interfaces.WorkingWithPayment;
import Interfaces.WorkingWithTheBasket;

public class Client {
    private final String name;
    private double wallet;
    private WorkingWithTheBasket working;

    public Client(String name, double wallet, WorkingWithTheBasket working) {
        this.name = name;
        this.wallet = wallet;
        this.working = working;
    }


    public void putInBasket(Product product) {
        working.addProductInBasket(product);
    }

//    public void toPay() {
//        if (!working.toPay(wallet)) {
//            System.out.println("Недостаточно средств для оплаты");
//            return;
//        }
//        System.out.println("Оплата прошла успешно.Приходите еще!");
//
//
//    }

    public void toPay(WorkingWithPayment payment) {
        if (payment.pay(wallet, working.calculateTheAmountInBasket())) {
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
        return working;
    }
}
