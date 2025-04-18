package week2;

public class cat {
    String name;
    String color;
    int age;
    int nrOfLegs;


    public void canMeow(){
        System.out.println(name + " says 'Meow'!");
    }

    public void canSleep(){
        System.out.println(name + " is going to sleep now. BYE!");
    }

    public void display(){
        System.out.println("My cat is named " + name + ". " + "He is " + color + "." + " He is " + age + " years old. He has " + nrOfLegs + " legs.");
    }
}
