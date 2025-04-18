package week2;

public class app {
    public static void main(String[] args) {
        dog myDog = new dog();

        myDog.name = "Tuco";
        myDog.color = "brown and black";
        myDog.age = 7;
        myDog.nrOfLegs = 4;


        cat myCat = new cat();

        myCat.name = "White Cat";
        myCat.color = "white";
        myCat.age = 9;
        myCat.nrOfLegs = 4;


        myDog.display();
        myDog.canBark();
        myDog.isWagginTail();

        myCat.display();
        myCat.canMeow();
        myCat.canSleep();



    }
}
