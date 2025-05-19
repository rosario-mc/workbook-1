package week7.interfacesExercises;

public class Dog implements Eater{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " the dog is eating!");
    }
}
