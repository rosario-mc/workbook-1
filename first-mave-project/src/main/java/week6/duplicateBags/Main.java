package week6.duplicateBags;

public class Main {
    public static void main(String[] args) {
        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        chihuahuaBag.addItems(new Chihuahua("Tuco"));
        chihuahuaBag.addItems(new Chihuahua("Jellybean"));
        chihuahuaBag.addItems(new Chihuahua("Princess"));

        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.addItems(new Laptop("Apple"));
        laptopBag.addItems(new Laptop("Lenovo"));
        laptopBag.addItems(new Laptop("Dell"));

        chihuahuaBag.printContents("  Chihuahua");
        System.out.println("First Item on List: " + chihuahuaBag.getFirstItem());
        System.out.println("\n");
        laptopBag.printContents("   Laptop");
        System.out.println("First Item on List: " + laptopBag.getFirstItem());
    }
}
