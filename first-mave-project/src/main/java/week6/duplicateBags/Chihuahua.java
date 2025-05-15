package week6.duplicateBags;

public class Chihuahua {
    private String name;

    public Chihuahua(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Name | %-15s",name);
    }
}
