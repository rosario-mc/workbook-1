package week6.polymorphismExercise1;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;
        double value;

        if (age <= 3) {
            value = getOriginalCost();
            for (int i = 0; i < age; i++) {
                value -= value * 0.03;
            }
        } else if (age <= 6) {
            value = getOriginalCost();
            for (int i = 0; i < age; i++) {
                value -= value * 0.06;
            }
        } else if (age <= 10) {
            value = getOriginalCost();
            for (int i = 0; i < age; i++) {
                value -= value * 0.08;
            }
        } else {
            value = 1000.00;
        }

        if (odometer > 100000 &&
                !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value *= 0.75;
        }

        return value;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%-60s: %s\n", "MAKE/MODEL", makeModel) +
                String.format("%-60s: %s\n", "YEAR", year) +
                String.format("%-60s: %,d", "ODOMETER", odometer);

    }
}
