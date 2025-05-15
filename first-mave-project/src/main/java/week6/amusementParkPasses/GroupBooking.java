package week6.amusementParkPasses;

import java.util.ArrayList;
import java.util.List;

public class GroupBooking {
    private List<Pass> passes = new ArrayList<>();

    public void addPass(Pass pass){
        passes.add(pass);
    }

    public void printSummary(){
        double totalPrice = 0;

        System.out.printf("%-25s %14s%n", "NAME", "PRICE");
        System.out.println("------------------------------------------");

        for (Pass p : passes){
                System.out.printf(
                        "%-34s $%.2f%n",
                        p.getHolderName(),
                        p.calculateFinalPrice());
            totalPrice += p.calculateFinalPrice();
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-34s $%.2f%n", "TOTAL", totalPrice);
    }
}
