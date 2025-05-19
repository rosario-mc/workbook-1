package week7.interfacesExercises;

public class Car implements Moveable{
    @Override
    public void move() {
        System.out.println("Car is driving away!");
    }
}
