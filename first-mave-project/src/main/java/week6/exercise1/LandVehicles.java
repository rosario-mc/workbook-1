package week6.exercise1;

public class LandVehicles extends Vehicle{
    private int nrOfWheels;
    private int nrOfDoors;
    private int nrOfWindows;
    private boolean electric;
    private boolean AC;
    private boolean rearViewMirrors;

    public LandVehicles(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleType, String vehicleIdentificationType, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, int nrOfWheels, int nrOfDoors, int nrOfWindows, boolean electric, boolean AC, boolean rearViewMirrors) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleType, vehicleIdentificationType, vehicleName, color, transmission, engine, fuelType, GPS, radar);
        this.nrOfWheels = nrOfWheels;
        this.nrOfDoors = nrOfDoors;
        this.nrOfWindows = nrOfWindows;
        this.electric = electric;
        this.AC = AC;
        this.rearViewMirrors = rearViewMirrors;
    }

    public int getNrOfWheels() {
        return nrOfWheels;
    }

    public void setNrOfWheels(int nrOfWheels) {
        this.nrOfWheels = nrOfWheels;
    }


    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public int getNrOfWindows() {
        return nrOfWindows;
    }

    public void setNrOfWindows(int nrOfWindows) {
        this.nrOfWindows = nrOfWindows;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public boolean isRearViewMirrors() {
        return rearViewMirrors;
    }

    public void setRearViewMirrors(boolean rearViewMirrors) {
        this.rearViewMirrors = rearViewMirrors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWheels        : " + nrOfWheels +
                "\nDoors         : " + nrOfDoors +
                "\nWindows       : " + nrOfWindows +
                "\nElectric      : " + (electric ? "Yes" : "No") +
                "\nAC            : " + (AC ? "Yes" : "No") +
                "\nRear View Mirrors: " + (rearViewMirrors ? "Yes" : "No");
    }
}
