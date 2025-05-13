package week6.restaurantMiniExercise;

public class Dessert extends MenuItem {

    public Dessert(String name, double price, int calories) {
        super(name, price, calories);
    }

    public String getDescription (){
        String name = getName().toLowerCase();
        if (name.contains("arroz")){
            return "SUGAR FREE OPTION AVAILABLE";
        } else if(name.contains("platanos")){
            return "SERVED WITH CREMA AND LECHERA";
        }
        return "HOUSE SPECIAL";
    }
}
