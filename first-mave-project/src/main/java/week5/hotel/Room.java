package week5.hotel;

public class Room {

    private int numberOfBeds;
    private double roomPrice;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double roomPrice, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }

    public void checkIn() {
        if (!dirty) {
            occupied = true;
        } else {
            System.out.println("Room is dirty. Cannot check in.");
        }
    }

    public void checkout() {
        setOccupied(false);
        cleanRoom();
    }

    public void cleanRoom() {
        dirty = false;
        System.out.println("Room has been cleaned.");
    }

    @Override
    public String toString() {
        return "====Room Info====\n" +
                "Number Of Beds: " + numberOfBeds + "\n" +
                "Room Price: $" + String.format("%.2f", roomPrice) + "/Per Night\n" +
                "Occupied: " + (occupied ? "Yes" : "No") + "\n" +
                "Dirty: " + (dirty ? "Yes" : "No") + "\n" +
                "Available: " + (isAvailable() ? "Yes" : "No") + "\n";
    }
}
