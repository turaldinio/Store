package Store.Interfaces;

import Store.Model.Product;

import java.util.List;

public interface ExpensiveProductFilter {

    List<Product> expensiveFirst();
}
