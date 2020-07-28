package com.example.demo;

import com.example.demo.Components.Basket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DemoApplicationTests {

    @Test
    void addItem() {
        Basket basket = new Basket();
        basket.addToBasket("Milk");
        assertTrue(basket.getBasketContents().containsKey("Milk"));
    }

    @Test
    void getTotalOnTwoItems() {
        Basket basket = new Basket();
        basket.addToBasket("Milk");
        basket.addToBasket("Milk");
        double total = basket.getTotal();
        assertTrue(total == 2.60);
    }


    @Test
    void testBreadPromotion() {
        Basket basket = new Basket();
        basket.addToBasket("Soup");
        basket.addToBasket("Soup");
        basket.addToBasket("Soup");
        basket.addToBasket("Bread");
        double total = basket.getTotal();
        assertTrue(total == 2.35);
    }

    @Test
    void testApplePromotion() {
        Basket basket = new Basket();
        basket.addToBasket("Apples");
        basket.addToBasket("Apples");
        basket.addToBasket("Apples");
        double total = basket.getTotal();
        assertTrue(total == 2.70);
    }


    // Test each item, multiple stacks of one, multiple items, and their stacks, and totals
    // test invalid input (assert "item not in stock")
    // test price and promotions

}
