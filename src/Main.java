import Model.ElectronicsStore;
import Model.Order;
import Model.Product;
import abs.Store;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product("Iphone SE", 52000, 6.894),
                new Product("Iphone X", 57200, 7.3),
                new Product("Iphone 13", 83500, 8.2)
        );
        Store store = new ElectronicsStore(productList);


    }
}
