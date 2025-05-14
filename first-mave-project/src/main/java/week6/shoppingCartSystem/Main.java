package week6.shoppingCartSystem;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Product("APPLES", 2.99));
        cart.addItem(new Product("RICE", 3.99));
        cart.addItem(new Product("TOFU", 3.99));
        cart.addItem(new Product("CABBAGE", 1.99));
        cart.addItem(new DiscountedProduct("CUPCAKES", 2.99));
        cart.addItem(new DiscountedProduct("SOURDOUGH BREAD", 5.99));
        cart.addItem(new DiscountedProduct("PASTA", 1.99));
        cart.addItem(new DiscountedProduct("PROTEIN POWDER", 25.99));

        cart.printReciept();
    }
}
