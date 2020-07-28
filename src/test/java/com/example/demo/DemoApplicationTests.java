package com.example.demo;

import com.example.demo.Components.Basket;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMilk() {
		Basket basket = new Basket();
		basket.addToBasket("Milk");
		// Assert milk is in the basket
	}

	// Test each item, multiple stacks of one, multiple items, and their stacks, and totals

	// test invalid input (assert "item not in stock")

	// test price and promotions

}
