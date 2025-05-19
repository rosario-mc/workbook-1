package week7.interfacesExercises;

public class Cat implements Eater{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " the cat is eating!");
    }
}
