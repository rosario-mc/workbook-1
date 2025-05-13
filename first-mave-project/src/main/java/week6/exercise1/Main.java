package week6.exercise1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(200, 6,6, 600,12, 7000,"LAND VEHICLE", "CAR", "HONDA CIVIC", "BLACK", "MANUAL", "V6", "GAS", true, true, 4, 4, 4, false, true, true, true, true);
        System.out.println(car1);

        Moped moped1 = new Moped(150, 2, 2 , 200,10, 200, "LAND VEHICLE", "MOPED", "VESPA","GREEN", "AUTOMATIC", "V4", "GAS", true, true,2, 0, 0, false, false, false, true, true);
        System.out.println(moped1);

        SemiTruck truck1 = new SemiTruck(100, 2,2, 60, 50, 10000, "LAND VEHICLE", "SEMI-TRUCK", "MACK TRUCK", "WHITE", "MANUAL", "V12", "DIESEL",true, true, 16, 2, 3, false, true, false, true);
        System.out.println(truck1);

        Hovercraft hovercraft1 = new Hovercraft(200, 10, 11, 5000, 20, 8000,  "AMPHIBIOUS VEHICLE", "HOVERCRAFT", "SR.N4", "BLACK", "MANUAL", "HIRTH 2703", "DIESEL", true, true, "TRACKS", true, 4,"BLACK SKIRT FINGER", true);
        System.out.println(hovercraft1);
    }
}
