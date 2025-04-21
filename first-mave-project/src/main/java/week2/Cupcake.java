package week2;

public class Cupcake {
    String flavor;
    int calories;

    public Cupcake (String flavor, int calories){

        this.flavor= flavor;
        this.calories= calories;

        System.out.println("Created a cupcake: " + flavor + ", " + calories +" kcal.");

        if (isHealthy()) {
            System.out.println("Healthy-ish.");
        } else {
            System.out.println("Treat yourself!");
        }
    }

    public boolean isHealthy(){
        return calories < 200;
    }
}
