package week7.workingWithInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Rosario", "Miller-Canales", 29));
        myFamily.add(new Person("Myles", "Miller", 30));
        myFamily.add(new Person("Santorio", "Miller-Canales", 5));
        myFamily.add(new Person("Amado", "Miller-Canales", 4));

        System.out.println("My Family Consists Of The Following People:");
        for (Person p : myFamily){
            System.out.println(p.getFirstName() + " " + p.getLastName() + " who is " + p.getAge() + " years old.");
        }

        Collections.sort(myFamily);

        System.out.println("\nMy Family Sorted by Last Name, First Name, and Age: ");
        for (Person p : myFamily) {
            System.out.println(p.getFirstName() + " " + p.getLastName() + " who is " + p.getAge() + " years old.");
        }
    }
}
