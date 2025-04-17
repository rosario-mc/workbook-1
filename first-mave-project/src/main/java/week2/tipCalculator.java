package week2;

import java.util.Scanner;

public class tipCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //bill amount
        double billAmount = getBillAmount("What is the bill amount?: ");

        //desired tip %
        double desiredTipPercentage = getDesiredTipPercentage("What is your desired tip percentage?: ");

        //calculated tip amount
        double tipAmount = getTipAmount(desiredTipPercentage, billAmount);

        //calculate total bill
        double totalBill = getTotalBill(billAmount, tipAmount);

        //round(for fun)
        double totalBillFun = forFun(totalBill);
        scanner.close();
    }

    public static double getBillAmount(String message){
        System.out.println(message);
        double billAmount = scanner.nextDouble();
        return billAmount;
    }

    public static double getDesiredTipPercentage(String prompt){
        System.out.println(prompt);
        double desiredTipPercentage = scanner.nextDouble();
        return desiredTipPercentage;
    }

    public static double getTipAmount(double desiredTipPercentage , double billAmount){
        double tipAmount = Math.round((billAmount * (desiredTipPercentage / 100)) * 10) / 10.0;
        System.out.printf("Tip Amount: $%.2f\n" , tipAmount);
        return tipAmount;
    }

    public static double getTotalBill(double billAmount, double tipAmount){
        double totalBill = billAmount + tipAmount;
        System.out.printf("Total Bill: $%.2f\n" , totalBill);
        return totalBill;
    }

    public static double forFun(double totalBill){
        System.out.printf("Rounded up total: $%.2f\n" , Math.ceil(totalBill));
        System.out.printf("Rounded down total: $%.2f\n" , Math.floor(totalBill));
        return totalBill;
    }
}
