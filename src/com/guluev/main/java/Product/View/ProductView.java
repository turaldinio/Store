package Product.View;

import Product.Model.Product;
import com.google.gson.Gson;


public class ProductView implements View {
    public void printInfo(String productName) {
        Gson gson = new Gson();
        Product product = gson.fromJson(productName,Product.class);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Название").append(product.getName()).append("\n").
                append("Цена:").append(product.getPrice()).append("\n")
                .append("Рейтинг:").append(product.getRating());
        System.out.println(stringBuilder.toString());
    }
}
