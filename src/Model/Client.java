package Model;

public class Client {
    private final String name;
    private double wallet;
    private final Order order;

    public Client(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        order = new Order();
    }


    public void putInBasket(Product product) {
        order.putInBasket(product);
    }

    public void toPay() {
        if (!order.toPay(wallet)) {
            System.out.println("Недостаточно средств для оплаты");
            return;
        }
        System.out.println("Оплата прошла успешно.Приходите еще!");
        

    }

}
