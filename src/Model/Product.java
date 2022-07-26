package Model;

public class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        setRating(rating);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating > 10) {
            System.out.println("Рейтинг товара " + getName() + " не может иметь значения больше 10.Ему выставлено def значение 0");
            return;
        }
        this.rating = rating;


    }

    @Override
    public String toString() {
        return String.format("%s %s руб %.1f/10", getName(), getPrice(), getRating());

    }
}
