package week2;

public class app2 {
    public static void main(String[] args) {
        house myHouse = new house();

        myHouse.color = "red";
        myHouse.nrWindows = 6;
        myHouse.nrRooms = 2;
        myHouse.hasPool = false;
        myHouse.isTwoStory = false;

        car myCar = new car();
        myCar.color = "blue";
        myCar.nrWindows = 7;
        myCar.hasSunRoof = false;
        myCar.isPaidOff = true;

        myHouse.displayHouse();
        myHouse.describePool();
        myHouse.describeStories();

        myCar.displayCar();
        myCar.describeSunRoof();
        myCar.describePaymentStatus();

    }
}
