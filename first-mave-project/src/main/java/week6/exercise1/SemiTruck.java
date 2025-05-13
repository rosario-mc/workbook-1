package week6.exercise1;

public class SemiTruck extends LandVehicles{
    private boolean sleepingQuarters;

    public SemiTruck(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleType, String vehicleIdentificationType, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, int nrOfWheels, int nrOfDoors, int nrOfWindows, boolean electric, boolean AC, boolean rearViewMirrors, boolean sleepingQuarters) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleType, vehicleIdentificationType, vehicleName, color, transmission, engine, fuelType, GPS, radar, nrOfWheels, nrOfDoors, nrOfWindows, electric, AC, rearViewMirrors);
        this.sleepingQuarters = sleepingQuarters;
    }

    public boolean isSleepingQuarters() {
        return sleepingQuarters;
    }

    public void setSleepingQuarters(boolean sleepingQuarters) {
        this.sleepingQuarters = sleepingQuarters;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSleeping Quarters: " + (sleepingQuarters ? "Yes" : "No\n\n");
    }
}
