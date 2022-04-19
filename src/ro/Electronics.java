package ro;

public class Electronics extends Product {
    private String type;
    private double length, width, height, weight;

    public Electronics(String newName, int price, int quantity, String description,String type, double lenght ,double width, double height, double weight) {
        super(newName, price, quantity, description);
        this.height=height;
        this.width=width;
        this.length=lenght;
        this.weight=weight;
    }
}
