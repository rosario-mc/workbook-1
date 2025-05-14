package week6.shoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product item) {
        items.add(item);
    }

    public void printReceipt() {
        double totalPrice = 0;

        System.out.printf("%-25s %10s%n", "ITEM", "PRICE");
        System.out.println("---------------------------------------");

        for (Product i : items) {
            double priceToUse;

            if (i instanceof DiscountedProduct) {
                DiscountedProduct dp = (DiscountedProduct) i;
                priceToUse = dp.getFinalPrice();
            } else {
                priceToUse = i.getPrice();
            }

            System.out.printf("%-25s $%9.2f%n", i.getName(), priceToUse);
            totalPrice += priceToUse;
        }

        double taxAmount = totalPrice * 0.21;
        double totalAfterTax = totalPrice + taxAmount;

        System.out.println("---------------------------------------");
        System.out.printf("%-25s $%9.2f%n", "TOTAL BEFORE TAX", totalPrice);
        System.out.printf("%-25s $%9.2f%n", "TAX (21%)", taxAmount);
        System.out.printf("%-25s $%9.2f%n", "TOTAL AFTER TAX", totalAfterTax);
    }
}
