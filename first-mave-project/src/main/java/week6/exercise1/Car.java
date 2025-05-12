package week6.exercise1;

public class Car extends LandVehicles{
    private boolean sunroof;
    private boolean trunk;

    public Car(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, int nrOfWheels, int nrOfDoors, int nrOfWindows, boolean electric, boolean AC, boolean rearViewMirrors, boolean sunroof, boolean trunk) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleName, color, transmission, engine, fuelType, GPS, radar, nrOfWheels, nrOfDoors, nrOfWindows, electric, AC, rearViewMirrors);
        this.sunroof = sunroof;
        this.trunk = trunk;
    }

    public boolean isSunroof() {
        if (sunroof){
            System.out.println("The sun roof is opening. Enjoy the breeze.");
        } else {
            System.out.println("No sunroof feature available.");
        }
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean isTrunk() {
        if (trunk){
            System.out.println("The trunk is opening...");
        } else {
            System.out.println("No trunk storage available for " + getVehicleName() + ".");
        }
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\n--- Car Features ---" +
                "\nSunroof       : " + (sunroof ? "Yes" : "No") +
                "\nTrunk         : " + (trunk ? "Yes" : "No");
    }
}
