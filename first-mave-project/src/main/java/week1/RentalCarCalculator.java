package week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //date
        String pickUpDate = getDate();

        //number of days
        int daysNeeded = getDaysNeeded();

        //basic car rental
        double basicCarRental = getBasicRental(daysNeeded);

        //electronic toll
        double electronicTollTag = getTollTag(daysNeeded, basicCarRental);

        //GPS
        double gps = getGPS(daysNeeded, basicCarRental);

        //Roadside assistance
        double roadside = getRoadside(daysNeeded, basicCarRental);

        //age
        double age = getAge(basicCarRental);

        //calculate
        double total = calculateTotalPrice(basicCarRental, electronicTollTag, gps, roadside, age);

        displayTotal(electronicTollTag , gps, roadside , age , total);

        scanner.close();
    }

    public static String getDate() {
        System.out.println("Pick up date?: ");
        String pickUpDate = scanner.nextLine();
        return pickUpDate;
    }

    public static int getDaysNeeded() {
        System.out.println("How many days will you need the rental car?: ");
        int daysNeeded = scanner.nextInt();
        scanner.nextLine();
        return daysNeeded;
        //5
    }

    public static double getBasicRental(int daysNeeded) {
        double basicCarRental = daysNeeded * 29.99;
        return basicCarRental;
        //149.95
    }

    public static double getTollTag(int daysNeeded, double basicCarRental) {
        System.out.println("Would you like to add the electronic toll tag at $3.95/day (Y/N)?: ");
        String electronicTollTag = scanner.nextLine();
        double totalTollTag = 0;
        if (electronicTollTag.equals("Y")) {
            totalTollTag = daysNeeded * 3.95;
        }
        return totalTollTag;
        //19.75
    }

    public static double getGPS(int daysNeeded, double basicCarRental) {
        System.out.println("Would you like to add GPS at $2.95/day (Y/N)?: ");
        String gps = scanner.nextLine();
        double totalGPS = 0;
        if (gps.equals("Y")) {
            totalGPS = daysNeeded * 2.95;
        }
        return totalGPS;
        //14.75
    }

    public static double getRoadside(int daysNeeded, double basicCarRental) {
        System.out.println("Would you like to add roadside assistance at $3.95/day (Y/N): ");
        String roadside = scanner.nextLine();
        double totalRoadside = 0;
        if (roadside.equals("Y")) {
            totalRoadside = daysNeeded * 3.95;
        }
        return totalRoadside;
        //19.75
    }

    public static double getAge(double basicCarRental) {
        System.out.println("What is your age?: ");
        int age = scanner.nextInt();
        double surcharge = 0;
        if (age <= 25) {
            surcharge = basicCarRental * .3;
        }
        return surcharge;
        //44.98
    }

    public static double calculateTotalPrice(double basicCarRental, double totalTollTag, double totalGPS, double totalRoadside, double surcharge) {
        double total = basicCarRental + totalTollTag + totalGPS + totalRoadside + surcharge;
        return total;

    }

    public static double displayTotal(double totalTollTag , double totalGPS, double totalRoadside , double surcharge , double total){
        System.out.println("Optional Cost: ");
        System.out.println("Toll Tag: $" + totalTollTag);
        System.out.println("GPS: $" + totalGPS);
        System.out.println("Roadside: $" + totalRoadside);
        System.out.printf("Under Age Surcharge: $%.2f%n" , surcharge);
        System.out.printf("The total costs is: $%.2f%n" , total);
        return total;

    }
}