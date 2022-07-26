package Model;

import Interfaces.WorkingWithTheProduct;

public class Client {
    private final String name;
    private double wallet;
    private WorkingWithTheProduct working;

    public Client(String name, double wallet, WorkingWithTheProduct working) {
        this.name = name;
        this.wallet = wallet;
        this.working = working;
    }


    public void putInBasket(Product product) {
        working.addProductInBasket(product);
    }

    public void toPay() {
        if (!working.toPay(wallet)) {
            System.out.println("Недостаточно средств для оплаты");
            return;
        }
        System.out.println("Оплата прошла успешно.Приходите еще!");


    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public WorkingWithTheProduct getWorking() {
        return working;
    }
}
