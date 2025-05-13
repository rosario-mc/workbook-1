package week6.exercise1;

public class Moped extends LandVehicles{
    private boolean kickstand;
    private boolean handleBars;

    public Moped(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleType, String vehicleIdentificationType, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, int nrOfWheels, int nrOfDoors, int nrOfWindows, boolean electric, boolean AC, boolean rearViewMirrors, boolean kickstand, boolean handleBars) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleType, vehicleIdentificationType, vehicleName, color, transmission, engine, fuelType, GPS, radar, nrOfWheels, nrOfDoors, nrOfWindows, electric, AC, rearViewMirrors);
        this.kickstand = kickstand;
        this.handleBars = handleBars;
    }

    public boolean isKickstand() {
        return kickstand;
    }

    public void setKickstand(boolean kickstand) {
        this.kickstand = kickstand;
    }

    public boolean getHandleBars() {
        return handleBars;
    }

    public void setHandleBars(boolean handleBars) {
        this.handleBars = handleBars;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%-25s: %s\n", "KICKSTAND", kickstand ? "YES" : "NO") +
                String.format("%-25s: %s\n\n", "HANDLEBARS", handleBars ? "YES" : "NO");
    }
}
