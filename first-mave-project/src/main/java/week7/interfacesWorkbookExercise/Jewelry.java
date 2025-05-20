package week7.interfacesWorkbookExercise;

public class Jewelry extends FixedAsset {
    public Jewelry(String name, double marketValue) {
        super(name, marketValue);
    }

    @Override
    public String toString() {
        return getName() + " worth $" + String.format("%.2f", getValue());
    }
}