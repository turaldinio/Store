import Controller.StoreController;
import Model.*;
import Model.Store;

import java.util.List;

import Store.*;
import View.StoreViewImpl;

public class Main {
    public static void main(String[] args) {
        Product iphoneSe = new Product("Iphone SE", 52000, 6.8);
        Product iphoneX = new Product("Iphone X", 57200, 7.3);
        Product iphone13 = new Product("Iphone 13", 83500, 8.2);
        Product laptopHuawei = new Product("Laptop Huawei", 87500, 8.6);
        Product laptopSamsung = new Product("Laptop Samsung-GHE12", 64500, 6.2);
        Product laptopHp = new Product("Laptop HP-ZKF12", 34650, 4.2);
        Product headPonds = new Product("AirPods pro3", 12500, 8.1);

        List<Product> productList = List.of(iphoneX, iphoneSe, iphone13, laptopHuawei, laptopSamsung, laptopHp, headPonds);

        Store store = new ElectronicsStore(productList);

        StoreController storeController = new StoreController(new StoreViewImpl(), store);


        System.out.println("Здравствуйте, выберите необходимые товары:");
        storeController.updateView();
        System.out.println("----------------------------------------------");

        System.out.println("применяем сортировку по алфавиту");
        storeController.alphabeticSort();
        storeController.updateView();
        System.out.println("----------------------------------------------");

        System.out.println("Выбираем товар iphone13");
        Client client = new Client("Jon", 190324.20);
        client.putInBasket(iphone13);
        System.out.println("----------------------------------------------");

        System.out.println("Оплачиваем товар");

        System.out.println("----------------------------------------------");


    }
}
