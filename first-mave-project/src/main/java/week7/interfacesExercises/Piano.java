package week7.interfacesExercises;

public class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("The kid plays Mary Had A Little Lamb on the piano!");
    }
}
