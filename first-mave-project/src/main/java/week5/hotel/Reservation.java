package week5.hotel;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }


    public double getPrice() {
        double pricePerNight = 124.00;
        if (roomType.equalsIgnoreCase("king")) {
           pricePerNight = 139.00;
        }
        if (isWeekend()) {
            pricePerNight *= 1.1;
        }
        return pricePerNight;
    }

    public double getReservationTotal() {
        return numberOfNights * getPrice();
    }

    @Override
    public String toString(){
        return "====Reservation Information====\n" +
                "Room Type: " + roomType + "\n" +
                "Room Price: $" + getPrice() + "/Per Night\n" +
                "Number Of Nights: " + numberOfNights + "\n" +
                "Weekend: " + (weekend ? "Yes" : "No") + "\n" +
                "Reservation Total: $" + String.format("%.2f", getReservationTotal()) + "\n";
    }
}
