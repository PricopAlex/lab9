package ro;

public class Product {
    protected String name, description;
    protected int price, quantity;
    protected String brand="cola";

    public Product(String newName, int price, int quantity, String description) {
        this.name = newName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}
