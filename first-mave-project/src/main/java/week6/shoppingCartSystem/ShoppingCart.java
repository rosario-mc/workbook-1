package week6.shoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product item) {
        items.add(item);
    }

    public void printReciept() {
        double totalPrice = 0;

        System.out.printf("%-25s %-50s%n", "ITEM", "PRICE");
        System.out.println("------------------------------------");

        for (Product i : items){
            System.out.printf(
                    "%-25s $%-50.2f%n",
                    i.getName(),
                    i.getPrice()
            );
            totalPrice += i.getPrice();
        }

        System.out.println("------------------------------------");
        System.out.printf("%-25s $%.2f%n", "TOTAL", totalPrice);
    }
}
