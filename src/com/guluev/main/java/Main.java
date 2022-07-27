
import Buyer.Controller.BuyerController;
import Buyer.Model.Client;
import Buyer.View.BuyerViewImpl;
import Product.Product;
import Store.Controller.StoreController;
import Store.Model.ElectronicsStore;
import Store.Model.Store;
import Store.View.StoreViewImpl;
import Product.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Product iphoneSe = new Phone("Iphone SE", 52000, 6.8);
        Product iphoneX = new Phone("Iphone X", 57200, 7.3);
        Product iphone13 = new Phone("Iphone 13", 83500, 8.2);
        Product laptopHuawei = new Laptop("Laptop Huawei", 87500, 8.6);
        Product laptopSamsung = new Laptop("Laptop Samsung-GHE12", 64500, 6.2);
        Product laptopHp = new Laptop("Laptop HP-ZKF12", 34650, 4.2);
        Product headPonds = new HeadPhones("AirPods pro3", 12500, 8.1);

        List<Product> productList = List.of(iphoneX, iphoneSe, iphone13, laptopHuawei, laptopSamsung, laptopHp, headPonds);
        Store store = new ElectronicsStore(productList);
        StoreController storeController = new StoreController(new StoreViewImpl(), store);

        Client client = new Client("Jon", 83_550);
        BuyerController clientController = new BuyerController(client, new BuyerViewImpl());


        System.out.println("Здравствуйте, выберите необходимые товары:");
        storeController.updateView();
        System.out.println("----------------------------------------------");

        System.out.println("применяем сортировку по алфавиту");
        storeController.alphabeticSort();
        storeController.updateView();
        System.out.println("----------------------------------------------");


        System.out.println("Выбираем товар iphone13");
        clientController.putInBasket(iphone13);

        System.out.println("----------------------------------------------");

        System.out.println("Оплачиваем товар");
        clientController.toPay(clientController.currentBasketSum());
        System.out.println("----------------------------------------------");


    }
}
