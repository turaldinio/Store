package abs;

import Interfaces.Sorted.CheapProductFilter;
import Interfaces.Sorted.ExpensiveProductFilter;
import Model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Store {

  private   List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public String showAllProducts() {
        return productList.toString().
                substring(1, productList.toString().length() - 1);
    }

    public void cheapSort() {

        CheapProductFilter cheapFilter = () -> {
            return productList.stream().sorted(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) (o1.getPrice() - o2.getPrice());
                }
            }).collect(Collectors.toList());
        };
        System.out.println(cheapFilter.cheapFirst());

    }

    public void expensiveFirst() {
        ExpensiveProductFilter expensiveFilter = () -> {
            return productList.stream().sorted(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) (o2.getPrice() - o1.getPrice());
                }
            }).collect(Collectors.toList());
        };
        System.out.println(expensiveFilter.expensiveFirst());

    }

}

