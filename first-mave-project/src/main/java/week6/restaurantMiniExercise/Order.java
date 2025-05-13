package week6.restaurantMiniExercise;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void printOrderSummary() {
        double totalPrice = 0;
        int totalCalories = 0;

        System.out.printf("%-25s %-50s %-10s %-10s%n", "ITEM", "DESCRIPTION", "PRICE", "CALORIES");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (MenuItem item : items) {
            System.out.printf(
                    "%-25s %-50s $%-9.2f %-10d%n",
                    item.getName(),
                    item.getDescription(),
                    item.getPrice(),
                    item.getCalories()
            );

            totalPrice += item.getPrice();
            totalCalories += item.getCalories();
        }

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-76s $%-9.2f %-10d%n", "TOTAL", totalPrice, totalCalories);
    }
}
