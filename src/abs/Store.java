package abs;

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

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public String showAllProducts() {
        return productList.toString().
                substring(1, productList.toString().length() - 1);
    }

    public void cheapSort() {

        CheapProductFilter cheapFilter = () -> {
            return productList.stream().sorted(((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))).collect(Collectors.toList());
        };
        System.out.println(cheapFilter.cheapFirst());

    }

    public void expensiveFirst() {
        ExpensiveProductFilter expensiveFilter = () -> {
            return productList.stream().sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice())).collect(Collectors.toList());
        };
        System.out.println(expensiveFilter.expensiveFirst());

    }

    public void alphabeticSort() {
        AlphabeticProductSort alphSort = () -> {
            return productList.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
        };
        System.out.println(alphSort.alphabeticSort());
    }

    public void ratingSort() {
        RatingProductSort ratingSort=()->{
          return productList.stream().sorted(Comparator.comparingDouble(Product::getRating)).collect(Collectors.toList());
        };
        System.out.println(ratingSort.ratingSort());
    }


}

