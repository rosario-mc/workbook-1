package week7.interfacesExercises;

public class Main {
    public static void printAnything(Printable p){
        p.print();
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
    }
}
