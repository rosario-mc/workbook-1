package week7.interfacesExercises;

public class Document implements Printable{
    private String name;

    public Document(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + name);
    }
}
