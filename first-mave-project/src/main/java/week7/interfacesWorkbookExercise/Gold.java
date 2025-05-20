package week7.interfacesWorkbookExercise;

public class Gold extends FixedAsset{
    public Gold(String name, double marketValue) {
        super(name, marketValue);
    }

    @Override
    public String toString() {
        return getName() + " worth $" + String.format("%.2f", getValue());
    }
}
