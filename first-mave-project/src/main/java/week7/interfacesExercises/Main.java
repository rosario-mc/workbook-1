package week7.interfacesExercises;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printAnything(Printable p) {
        p.print();
    }

    public static Drawable getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else {
            return new Square();
        }
    }

    public static void main(String[] args) {
        Flyable b = new Bird();
        b.fly();

        Playable g = new Guitar();
        g.play();

        Playable p = new Piano();
        p.play();

        Document d = new Document("Week7Notes.txt");
        printAnything(d);

        Moveable[] movers = {new Car(), new Bike()};
        for (Moveable m : movers) {
            m.move();
        }

        Drawable shape = getShape("Square");
        shape.draw();

        List<Eater> eaters = new ArrayList<>();
        eaters.add(new Cat("White Cat"));
        eaters.add(new Dog("Jellybean"));
        eaters.add(new Cat("Dogg"));
        eaters.add(new Dog("Tuco"));

        for (Eater e : eaters) {
            e.eat();
        }

        List<Calculable> calculables = List.of(
                new Adder(6, 2),
                new Multiplier(9, 5)
        );

        for (Calculable c : calculables) {
            System.out.println("Results: " + c.calculate());
        }
    }
}
