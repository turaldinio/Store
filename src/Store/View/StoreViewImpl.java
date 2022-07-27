package Store.View;

import Store.Model.Product;

import java.util.List;

public class StoreViewImpl implements StoreView {
    @Override
    public void printList(List<Product> list) {
        System.out.println(list.toString().substring(1, list.toString().length() - 1));

    }
}
