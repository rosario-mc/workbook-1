package week6.exercise1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(200, 6,6, 600,12, 7000, "Civic", "black", "manual", "V6", "petroleum", true, true, 4, 4, 4, false, true, true, true, true);
        System.out.println(car1);
        SemiTruck truck1 = new SemiTruck(100, 2,2, 60, 50, 10000, "Mack Truck", "white", "manual", "V12", "diesel",true, true, 16, 2, 3, false, true, false, true);
        System.out.println(truck1);
    }
}
