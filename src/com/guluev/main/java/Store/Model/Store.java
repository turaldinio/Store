package Store.Model;

import Product.Model.Product;
import Store.Interfaces.AlphabeticProductSort;
import Store.Interfaces.CheapProductFilter;
import Store.Interfaces.ExpensiveProductFilter;
import Store.Interfaces.RatingProductSort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Store {

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Store(List<Product> productList) {
        this.productList = productList;
    }


    public void cheapSort() {

        CheapProductFilter cheapFilter = () -> {
            return productList.stream().sorted(((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))).collect(Collectors.toList());
        };
        setProductList(cheapFilter.cheapFirst());
    }

    public void expensiveFirst() {
        ExpensiveProductFilter expensiveFilter = () -> {
            return productList.stream().sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice())).collect(Collectors.toList());
        };
        setProductList(expensiveFilter.expensiveFirst());
    }

    public void alphabeticSort() {
        AlphabeticProductSort alphSort = () -> {
            return productList.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
        };
        setProductList(alphSort.alphabeticSort());
    }

    public void ratingSort() {
        RatingProductSort ratingSort = () -> {
            return productList.stream().sorted(Comparator.comparingDouble(Product::getRating)).collect(Collectors.toList());
        };
        setProductList(ratingSort.ratingSort());
    }
}


