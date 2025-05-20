package week7.interfacesWorkbookExercise;

public class House extends FixedAsset{
    public House(String name, double marketValue) {
        super(name, marketValue);
    }

    @Override
    public String toString() {
        return getName() + " worth $" + String.format("%.2f", getValue());
    }
}