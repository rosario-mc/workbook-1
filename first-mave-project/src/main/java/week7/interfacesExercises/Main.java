package week7.interfacesExercises;

public class Main {
    public static void printAnything(Printable p){
        p.print();
    }

    public static Drawable getShape(String type){
        if (type.equalsIgnoreCase("circle")){
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

        Moveable [] movers = {new Car(), new Bike()};
        for (Moveable m : movers){
            m.move();
        }

        Drawable shape = getShape("Square");
        shape.draw();
    }
}
