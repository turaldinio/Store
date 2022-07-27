package Store.Interfaces;

import Product.Model.Product;

import java.util.List;

public interface ExpensiveProductFilter {

    List<Product> expensiveFirst();
}
