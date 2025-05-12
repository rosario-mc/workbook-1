package week6.miniExercises;

public class Car extends Vehicle {
    public Car() {
        setSpeed(100);
    }

    @Override
    public String toString (){
        return "This car can go up to " + getSpeed() + " mph!";
    }
}