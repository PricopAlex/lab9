package ro;

public class Main {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics("lipstick", 55, 99, "Thiddasdasfwedgew", "blue", 21);
        presentCosmetics(cosmetics);
    }

    public static void presentCosmetics(Cosmetics cosmetics) {
        System.out.println("description: " + cosmetics.description);
        if (cosmetics.quantity <= 100) {
            System.out.println("the product is limited in stock");
        }
    }
}
