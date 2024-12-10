
package first;

    public class Flower {
    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        if (petals >= 0) { 
            this.petals = petals;
        } else {
            System.out.println("Number of petals cannot be negative.");
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price >= 0) { // Ensure a non-negative price
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Flower object
        Flower rose = new Flower("Rose", 30, 2.5f);

        // Print initial values
        System.out.println("Name: " + rose.getName());
        System.out.println("Petals: " + rose.getPetals());
        System.out.println("Price: $" + rose.getPrice());

        // Update values using setters
        rose.setName("Tulip");
        rose.setPetals(15);
        rose.setPrice(1.75f);

        // Print updated values
        System.out.println("Updated Name: " + rose.getName());
        System.out.println("Updated Petals: " + rose.getPetals());
        System.out.println("Updated Price: $" + rose.getPrice());
    }
}


