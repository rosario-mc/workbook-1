package week2;

public class car {
    String color;
    int nrWindows;
    boolean hasSunRoof;
    boolean isPaidOff;

    public void displayCar(){
        System.out.println("My car is " + color + ". It has " + nrWindows + " windows.");
    }
    public void describeSunRoof() {
        if (hasSunRoof) {
            System.out.println("It does have a sunroof. Pretty fancy!");
        } else {
            System.out.println("No sunroof on this one. All good though!");
        }
    }

    public void describePaymentStatus() {
        if (isPaidOff) {
            System.out.println("At least, the car is fully paid off. No more payments!");
        } else {
            System.out.println("Still making payments on this car.");
        }
    }
}
