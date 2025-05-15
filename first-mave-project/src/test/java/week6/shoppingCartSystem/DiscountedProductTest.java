package week6.shoppingCartSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountedProductTest {

    @Test
    void getFinalPrice() {
        DiscountedProduct dp = new DiscountedProduct("Shirt", 100.00);
        double expected = 90.00;
        assertEquals(expected, dp.getFinalPrice());
    }
}