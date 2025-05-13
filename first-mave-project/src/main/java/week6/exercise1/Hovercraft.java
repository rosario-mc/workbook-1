package week6.exercise1;

public class Hovercraft extends AmphibiousVehicle{
    private int nrOfPropellers;
    private String skirtFingers;
    private boolean controlCabin;

    public Hovercraft(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleType, String vehicleIdentificationType, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar, String wheelsOrTracks, boolean driveOnLandAndWater, int nrOfPropellers, String skirtFingers, boolean controlCabin) {
        super(speed, nrOfSeats, nrOfPassenger, cargoCapacity, fuelCapacity, weight, vehicleType, vehicleIdentificationType, vehicleName, color, transmission, engine, fuelType, GPS, radar, wheelsOrTracks, driveOnLandAndWater);
        this.nrOfPropellers = nrOfPropellers;
        this.skirtFingers = skirtFingers;
        this.controlCabin = controlCabin;
    }

    public int getNrOfPropellers() {
        return nrOfPropellers;
    }

    public void setNrOfPropellers(int nrOfPropellers) {
        this.nrOfPropellers = nrOfPropellers;
    }

    public String getSkirtFingers() {
        return skirtFingers;
    }

    public void setSkirtFingers(String skirtFingers) {
        this.skirtFingers = skirtFingers;
    }

    public boolean isControlCabin() {
        return controlCabin;
    }

    public void setControlCabin(boolean controlCabin) {
        this.controlCabin = controlCabin;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Propellers : " + nrOfPropellers +
                "\nSkirt Fingers        : " + skirtFingers +
                "\nControl Cabin        : " + (controlCabin ? "Yes" : "No\n\n");
    }
}
