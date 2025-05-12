package week6.exercise1;

public class Vehicle {
    private int speed;
    private int nrOfSeats;
    private int nrOfPassenger;
    private int cargoCapacity;
    private int fuelCapacity;
    private double weight;
    private String vehicleName;
    private String color;
    private String transmission;
    private String engine;
    private String fuelType;
    private boolean GPS;
    private boolean radar;

    public Vehicle(int speed, int nrOfSeats, int nrOfPassenger, int cargoCapacity, int fuelCapacity, double weight, String vehicleName, String color, String transmission, String engine, String fuelType, boolean GPS, boolean radar) {
        this.speed = speed;
        this.nrOfSeats = nrOfSeats;
        this.nrOfPassenger = nrOfPassenger;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.weight = weight;
        this.vehicleName = vehicleName;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.fuelType = fuelType;
        this.GPS = GPS;
        this.radar = radar;
    }

    public int getSpeed() {
        System.out.println(getVehicleName() + " has a maximum speed of " + getSpeed() + " mph.");
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNrOfSeats() {
        System.out.println(getVehicleName() + " has " + getNrOfSeats() + " number of seats.");
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public int getNrOfPassenger() {
        System.out.println(getNrOfPassenger() + " fits in the " + getVehicleName() + ".");
        return nrOfPassenger;
    }

    public void setNrOfPassenger(int nrOfPassenger) {
        this.nrOfPassenger = nrOfPassenger;
    }

    public int getCargoCapacity() {
        System.out.println(" is the cargo capacity for this vehicle.");
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        System.out.println(getVehicleName() + " has a fuel capacity of " + getFuelCapacity() + ".");
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getWeight() {
        System.out.println(getVehicleName() + " weighs " + getWeight() + " lbs.");
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getColor() {
        System.out.println(getVehicleName() + " is " + getColor() + ".");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        if (transmission.equalsIgnoreCase("automatic")) {
            System.out.println(getVehicleName() + " has an automatic transmission.");
        } else {
            System.out.println(getVehicleName() + " has a manual transmission.");
        }
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
        System.out.println( getVehicleName() + " uses " + fuelType + " for fuel.");
    }

    public boolean isGPS() {
        if (GPS){
            System.out.println("Vehicle has GPS available.");
        } else {
            System.out.println("Does not have GPS.");
        }
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public boolean isRadar() {
        if (radar){
            System.out.println("Vehicle has radar available.");
        } else {
            System.out.println("Does not have radar.");
        }
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
        return "\n--- Vehicle Details ---" +
                "\nName          : " + vehicleName +
                "\nColor         : " + color +
                "\nTransmission  : " + transmission +
                "\nEngine        : " + engine +
                "\nFuel Type     : " + fuelType +
                "\nSpeed         : " + speed + " mph" +
                "\nSeats         : " + nrOfSeats +
                "\nPassengers    : " + nrOfPassenger +
                "\nCargo Capacity: " + cargoCapacity + " lbs" +
                "\nFuel Capacity : " + fuelCapacity + " gallons" +
                "\nWeight        : " + weight + " lbs" +
                "\nGPS           : " + (GPS ? "Yes" : "No") +
                "\nRadar         : " + (radar ? "Yes" : "No");
    }
}
