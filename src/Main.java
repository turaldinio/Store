import Model.Client;
import Model.ElectronicsStore;
import Model.Order;
import Model.Product;
import abs.Store;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product iphoneSe = new Product("Iphone SE", 52000, 6.894);
        Product iphoneX = new Product("Iphone X", 57200, 7.3);
        Product iphone13 = new Product("Iphone 13", 83500, 8.2);

        List<Product> productList = List.of(iphoneSe, iphoneX, iphone13);

        Store store = new ElectronicsStore(productList);

        System.out.println("Здравствуйте, выберите необходимые товары:");
        System.out.println(store.showAllProducts());

        Client client = new Client("Jon", 30250.20);
        client.putInBasket(iphone13);
        client.putInBasket(iphoneSe);
        client.toPay();

    }
}
