package week6.shoppingCartSystem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart(); // new cart before each test
    }

    @Test
    void addItem() {
        cart.addItem(new Product("Pencil", 2.99));
    }

    @Test
    void totalWithDiscountedAndRegularItems() {
        cart.addItem(new Product("Pen", 2.00));
        cart.addItem(new DiscountedProduct("Shirt", 20.00));
    }
}