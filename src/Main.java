import Buyer.Model.Client;
import Store.Controller.ClientController;
import Store.Controller.StoreController;
import Store.Model.*;
import Store.Model.Store;

import java.util.List;

import Buyer.View.BuyerViewImpl;
import Store.View.StoreViewImpl;

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

        Client client = new Client("Jon", 83_550);
        ClientController clientController = new ClientController(client, new BuyerViewImpl());


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
