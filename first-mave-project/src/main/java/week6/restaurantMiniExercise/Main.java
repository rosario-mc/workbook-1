package week6.restaurantMiniExercise;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new MainDish("MOLE ROJO", 12.99, 980));
        order.addItem(new MainDish("YUCA FRITA", 15.99, 1200));
        order.addItem(new MainDish("CHICKEN NOODLE SOUP", 10.99, 500));
        order.addItem(new Dessert("PLATANOS FRITOS", 9.99, 500));
        order.addItem(new Dessert("ARROZ CON LECHE", 8.99, 450));
        order.addItem(new Dessert("ICE CREAM SUNDAY", 7.99, 650));
        order.addItem(new Drink("COLA CHAMPAGNE", 3.99, 125));
        order.addItem(new Drink("HORCHATA", 3.99, 150));
        order.addItem(new Drink("COKE ZERO", 3.99, 0));

        order.printOrderSummary();
    }
}
