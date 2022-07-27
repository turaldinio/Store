package Product.Controller;


import Product.Model.Product;
import Product.View.*;

public class ProductController {
    private Product product;
    private View view;

    public ProductController(Product product, View view) {
        this.product = product;
        this.view = view;
    }

    public String getName() {
        return product.getName();
    }

    public double getPrice() {
        return product.getPrice();
    }

    public double getRating() {
        return product.getRating();
    }

    public void setRating(double rating) {
        product.setRating(rating);
    }

    public String productToJson() {
        return product.productToJson();
    }

    public void getFullInfo(String productName) {
        view.printInfo((productName));
    }


}

