package ro;

public class Cosmetics extends Product {
    private String color;
    private int weight;

    public Cosmetics(String newName, int price, int quantity, String description, String color, int weight) {
        super(newName, price, quantity, description);
        this.color = color;
        this.weight = weight;

    }
}
