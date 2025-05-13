package week6.restaurantMiniExercise;

public class MainDish extends MenuItem{

    public MainDish(String name, double price, int calories) {
        super(name, price, calories);
    }

    public String getDescription (){
        String name = getName().toLowerCase();
        if (name.contains("mole")){
            return "SERVED WITH A SIDE OR RICE";
        } else if(name.contains("yuca")){
            return "SERVED WITH A SERVING OF CHICHARRON";
        }
        return "SPECIAL OF THE DAY";
    }
}
