package Model;

import Interfaces.Sorted.AlphabeticProductSort;
import Interfaces.Sorted.CheapProductFilter;
import Interfaces.Sorted.ExpensiveProductFilter;
import Interfaces.Sorted.RatingProductSort;
import Model.Product;

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

  

    public List<Product> cheapSort() {

        CheapProductFilter cheapFilter = () -> {
            return productList.stream().sorted(((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))).collect(Collectors.toList());
        };
        return cheapFilter.cheapFirst();
    }

    public List<Product> expensiveFirst() {
        ExpensiveProductFilter expensiveFilter = () -> {
            return productList.stream().sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice())).collect(Collectors.toList());
        };
        return expensiveFilter.expensiveFirst();

    }

    public List<Product> alphabeticSort() {
        AlphabeticProductSort alphSort = () -> {
            return productList.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
        };
        return alphSort.alphabeticSort();
    }

    public List<Product> ratingSort() {
        RatingProductSort ratingSort = () -> {
            return productList.stream().sorted(Comparator.comparingDouble(Product::getRating)).collect(Collectors.toList());
        };
        return ratingSort.ratingSort();
    }
}


