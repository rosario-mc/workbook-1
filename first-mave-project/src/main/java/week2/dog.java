package week2;

import org.w3c.dom.ls.LSOutput;

public class dog {
    String name;
    String color;
    int age;
    int nrOfLegs;

    public void canBark(){
        System.out.println(name + " says 'Woof'!");
    }

    public void isWagginTail(){
        System.out.println(name + " is wagging his tail because he is so excited!");
    }

    public void display(){
        System.out.println("My dog is named " + name + ". " + "He is " + color + "." + ". He is " + age + " years old. He has " + nrOfLegs + " legs.");
    }
}
