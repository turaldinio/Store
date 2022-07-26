package abs;

import Model.Client;
import Model.Product;

import java.util.List;

public abstract class Store {

    List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public String showAllProducts() {
        return productList.toString().
                substring(1, productList.toString().length() - 1);
    }
}
