package week7.interfacesExercises;

public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Musician is strumming the guitar!");
    }
}
