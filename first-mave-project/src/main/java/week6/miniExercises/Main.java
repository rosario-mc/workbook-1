package week6.miniExercises;

public class Main {
    public static void main(String[] args) {
        Dog animal1 = new Dog("Bob", "Dog");
        System.out.println(animal1);
        animal1.makeSound();
        animal1.wagTail();

        Car car = new Car();
        System.out.println(car);

        Person person1 = new Person();
        person1.setName("Rosario");
        person1.setAge(29);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

        House house = new House();
        house.goToSleep();
    }
}