package week6.exercise1;

public class AmphibiousVehicle extends Vehicle{
    private String wheelsOrTracks;
    private boolean driveOnLandAndWater;

    public AmphibiousVehicle(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleType, String vehicleIdentificationType, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, String wheelsOrTracks, boolean driveOnLandAndWater) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleType, vehicleIdentificationType, vehicleName, color, transmission, engine, fuelType, GPS, radar);
        this.wheelsOrTracks = wheelsOrTracks;
        this.driveOnLandAndWater = driveOnLandAndWater;
    }

    public String getWheelsOrTracks() {
        return wheelsOrTracks;
    }

    public void setWheelsOrTracks(String wheelsOrTracks) {
        this.wheelsOrTracks = wheelsOrTracks;
    }

    public boolean isDriveOnLandAndWater() {
        return driveOnLandAndWater;
    }

    public void setDriveOnLandAndWater(boolean driveOnLandAndWater) {
        this.driveOnLandAndWater = driveOnLandAndWater;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWheels/Tracks  : " + wheelsOrTracks +
                "\nDrive on Land & Water: " + (driveOnLandAndWater ? "Yes" : "No");
    }
}
