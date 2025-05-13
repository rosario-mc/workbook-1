package week6.restaurantMiniExercise;

public class Drink extends MenuItem {

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

    public String getDescription (){
        String name = getName().toLowerCase();
        if (name.contains("cola")){
            return "GLASS BOTTLE";
        } else if(name.contains("horchata")){
            return "CONTAINS WHOLE MILK";
        }
        return "DIET DRINK";
    }
}
