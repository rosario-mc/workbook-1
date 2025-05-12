package week6.miniExercises;

public class Dog extends Animal{
    public Dog(String name, String species) {
        super(name, species);
    }

    public void wagTail(){
        System.out.println(getName() + " wags its tail!");
    }


}
