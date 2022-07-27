package Buyer.Controller;

import Buyer.Model.Client;
import Buyer.View.BuyertView;
import Product.Product;

public class BuyerController {
    private Client client;
    private BuyertView view;

    public BuyerController(Client client, BuyertView view) {
        this.client = client;
        this.view = view;
    }

    public void putInBasket(Product product) {
        client.putInBasket(product);
    }

    public double currentBasketSum() {
        return client.currentBasketSum();
    }

    public void toPay(double currentAmount) {
        client.toPay(currentAmount);
    }

    public void updateView() {
        view.printList(client.getBasket());
    }

    public String getName() {
        return client.getName();
    }

    public double getWallet() {
        return client.getWallet();
    }
}
