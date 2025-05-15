package week6.duplicateBags;

public class Laptop {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return String.format("Brand | %-15s ", brand);
    }
}
