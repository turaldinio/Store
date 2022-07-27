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

    public void updateView() {
        view.printList(getList());
    }

    public void expensiveFirst() {
        store.expensiveFirst();
    }

    public void cheapFirst() {
        store.cheapSort();
    }

    public void alphabeticSort() {
        store.alphabeticSort();
    }

    public void ratingSort() {
        store.ratingSort();
    }

}
