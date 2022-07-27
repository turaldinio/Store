package Controller;

import View.View;
import Model.Product;
import Model.Store;

import java.util.List;

public class StoreController {
    private View view;
    private Store store;

    public StoreController(View view, Store store) {
        this.view = view;
        this.store = store;
    }

    public void setList(List<Product> list) {
        store.setProductList(list);
    }

    public List<Product> getList() {
        return store.getProductList();
    }

    public void updateView(List<Product> list) {
        view.printList(list);
    }

    public List<Product> expensiveFirst() {
        return store.expensiveFirst();
    }

    public List<Product> cheapFirst() {
        return store.cheapSort();
    }

    public List<Product> alphabeticSort() {
        return store.alphabeticSort();
    }

    public List<Product> ratingSort() {
        return store.ratingSort();
    }

}
