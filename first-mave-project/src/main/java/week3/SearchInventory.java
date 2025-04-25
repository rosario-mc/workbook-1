package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchInventory {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<Product> inventory = getInventory();
        writeDataInventory();
        readInventory("We carry the following inventory: ");


        System.out.println("We carry the following inventory: ");
        for(int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("ID: %d | %s | Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(123456, "Gala Apple", 1.99f));
        inventory.add(new Product(789456, "Watermelon", 5.99f));
        inventory.add(new Product(456123, "Green Grapes", 3.99f));
        inventory.add(new Product(897456, "Kiwi", 0.99f));
        inventory.add(new Product(564123, "Dragon Fruit", 4.99f));
        return inventory;
    }

    public static void writeDataInventory(){
        try {
            FileWriter writer = new FileWriter("data/inventory.csv");
            writer.write(
                    "1234 | Zucchini | 1.99\n" +
                    "5678 | Broccoli | 2.99\n" +
                    "9012 | Tomato | 0.99\n" +
                    "3456 | Onion | 0.75\n" +
                    "7890 | Garlic | 0.50\n"
                    );
            writer.close();
        } catch (IOException e) {
            System.out.println("Oh no: " + e.getMessage());
        }
    }

    public static List<Product> readInventory(String prompt) {
        System.out.println(prompt);
        List<Product> productList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/inventory.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if(parts.length == 3){
                    try{
                        int id = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        float price = Float.parseFloat(parts[2].trim());

                        Product product = new Product(id, name, price);
                        productList.add(product);
                    } catch (NumberFormatException e){
                        System.out.println("Error converting product data :0 " + e.getMessage());
                    }
                }else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Oh no: " + e.getMessage());
        }
        return productList;
    }

}
