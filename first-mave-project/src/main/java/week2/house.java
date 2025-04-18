package week2;

public class house {
    String color;
    int nrWindows;
    int nrRooms;
    boolean hasPool;
    boolean isTwoStory;

    public void displayHouse(){
        System.out.println("My house has " + nrWindows + " windows. It also has " + nrRooms + " rooms.");
    }

    public void describePool() {
        if (hasPool) {
            System.out.println("It even has a pool! Perfect for summer.");
        } else {
            System.out.println("Unfortunately, there's no pool. Maybe one day!");
        }
    }

    // Describes if it's a two-story house
    public void describeStories() {
        if (isTwoStory) {
            System.out.println("It's a two-story house, which gives it a nice spacious feel.");
        } else {
            System.out.println("It's a cozy one-story home. Still pretty comfortable.");
        }
    }

}
