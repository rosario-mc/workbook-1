package week6.shoppingCartSystem;

public class DiscountedProduct extends Product {
    private double discountPercentage = 0.10;

    public DiscountedProduct(String name, double price) {
        super(name, price);
    }

    public double getFinalPrice() {
        double discountedPrice = getPrice() - (getPrice() * discountPercentage);
        return discountedPrice;
    }
}
