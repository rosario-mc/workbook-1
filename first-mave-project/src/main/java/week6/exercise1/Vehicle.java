package week6.exercise1;

public class Vehicle {
    private int speed;
    private int nrOfSeats;
    private int nrOfPassenger;
    private int cargoCapacity;
    private int fuelCapacity;
    private double weight;
    private String vehicleType;
    private String vehicleIdentificationType;
    private String vehicleName;
    private String color;
    private String transmission;
    private String engine;
    private String fuelType;
    private boolean GPS;
    private boolean radar;

    public Vehicle(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleType, String vehicleIdentificationType, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar) {
        this.speed = speed;
        this.nrOfSeats = nrOfSeats;
        this.nrOfPassenger = nrOfPassenger;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.weight = weight;
        this.vehicleType = vehicleType;
        this.vehicleIdentificationType = vehicleIdentificationType;
        this.vehicleName = vehicleName;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.fuelType = fuelType;
        this.GPS = GPS;
        this.radar = radar;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public int getNrOfPassenger() {
        return nrOfPassenger;
    }

    public void setNrOfPassenger(int nrOfPassenger) {
        this.nrOfPassenger = nrOfPassenger;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleIdentificationType() {
        return vehicleIdentificationType;
    }

    public void setVehicleIdentificationType(String vehicleIdentificationType) {
        this.vehicleIdentificationType = vehicleIdentificationType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public boolean isRadar() {
        return radar;
    }

    public void setRadar(boolean radar) {
        this.radar = radar;
    }

    public void drive() {
        System.out.println(getVehicleName() + " is driving off into the forest.");
    }

    @Override
    public String toString() {
        return "\n\n============= VEHICLE DETAILS =============\n" +
                String.format("%-25s: %s\n", "VEHICLE TYPE", vehicleType) +
                String.format("%-25s: %s\n", "IDENTIFICATION", vehicleIdentificationType) +
                String.format("%-25s: %s\n", "NAME", vehicleName) +
                String.format("%-25s: %s\n", "COLOR", color) +
                String.format("%-25s: %s\n", "TRANSMISSION", transmission) +
                String.format("%-25s: %s\n", "ENGINE", engine) +
                String.format("%-25s: %s\n", "FUEL TYPE", fuelType) +
                String.format("%-25s: %d MPH\n", "MAX SPEED", speed) +
                String.format("%-25s: %d\n", "SEATING CAPACITY", nrOfSeats) +
                String.format("%-25s: %d\n", "PASSENGERS", nrOfPassenger) +
                String.format("%-25s: %d LBS\n", "CARGO CAPACITY", cargoCapacity) +
                String.format("%-25s: %d GALLONS\n", "FUEL CAPACITY", fuelCapacity) +
                String.format("%-25s: %.2f LBS\n", "WEIGHT", weight) +
                String.format("%-25s: %s\n", "GPS", GPS ? "YES" : "NO") +
                String.format("%-25s: %s\n", "RADAR", radar ? "YES" : "NO");
    }
}
