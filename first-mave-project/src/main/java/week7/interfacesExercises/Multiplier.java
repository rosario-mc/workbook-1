package week7.interfacesExercises;

public class Multiplier implements Calculable {
    int nr1;
    int nr2;

    public Multiplier(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    @Override
    public int calculate() {
        return nr1 * nr2;
    }
}
