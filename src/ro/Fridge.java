package ro;

public class Fridge extends Electronics {
    private double temperature;


    public Fridge(String newName, int price, int quantity, String description, String type, double lenght, double width,
                  double height, double weight, double temperature) {
        super(newName, price, quantity, description, type, lenght, width, height, weight);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
