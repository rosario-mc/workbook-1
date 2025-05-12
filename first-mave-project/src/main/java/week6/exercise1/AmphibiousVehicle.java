package week6.exercise1;

public class AmphibiousVehicle extends Vehicle{
    private String wheelsOrTracks;
    private boolean driveOnLandAndWater;

    public AmphibiousVehicle(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, String wheelsOrTracks, boolean driveOnLandAndWater) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleName, color, transmission, engine, fuelType, GPS, radar);
        this.wheelsOrTracks = wheelsOrTracks;
        this.driveOnLandAndWater = driveOnLandAndWater;
    }

    public String getWheelsOrTracks() {
        if (wheelsOrTracks.equalsIgnoreCase("wheels")){
            System.out.println(getVehicleName() + " has wheels");
        } else {
            System.out.println( getVehicleName() + " has tracks.");
        }
        return wheelsOrTracks;
    }

    public void setWheelsOrTracks(String wheelsOrTracks) {
        this.wheelsOrTracks = wheelsOrTracks;
    }

    public boolean isDriveOnLandAndWater() {
        if (driveOnLandAndWater){
            System.out.println(getVehicleName() + " is an amphibious vehicle. It can drive on land and water.");
        } else {
            System.out.println(getVehicleName() + " can't drive on both land and water.");
        }
        return driveOnLandAndWater;
    }

    public void setDriveOnLandAndWater(boolean driveOnLandAndWater) {
        this.driveOnLandAndWater = driveOnLandAndWater;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n--- Amphibious Vehicle Features ---" +
                "\nWheels/Tracks  : " + wheelsOrTracks +
                "\nDrive on Land & Water: " + (driveOnLandAndWater ? "Yes" : "No");
    }
}
