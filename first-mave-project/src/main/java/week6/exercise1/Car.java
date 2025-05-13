package week6.exercise1;

public class Car extends LandVehicles{
    private boolean sunroof;
    private boolean trunk;

    public Car(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleType, String vehicleIdentificationType, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, int nrOfWheels, int nrOfDoors, int nrOfWindows, boolean electric, boolean AC, boolean rearViewMirrors, boolean sunroof, boolean trunk) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleType, vehicleIdentificationType, vehicleName, color, transmission, engine, fuelType, GPS, radar, nrOfWheels, nrOfDoors, nrOfWindows, electric, AC, rearViewMirrors);
        this.sunroof = sunroof;
        this.trunk = trunk;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean isTrunk() {
        return trunk;
    }

    public void setTrunk(boolean trunk) {
        this.trunk = trunk;
    }
    @Override
    public String toString() {
        return super.toString() +
                String.format("%-25s: %s\n", "SUNROOF", sunroof ? "YES" : "NO") +
                String.format("%-25s: %s\n\n", "TRUNK", trunk ? "YES" : "NO");
    }
}
