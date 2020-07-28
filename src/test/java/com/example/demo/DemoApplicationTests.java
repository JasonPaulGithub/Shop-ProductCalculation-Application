package com.example.demo;

import com.example.demo.Components.Basket;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	// TODO: No need for UI, just input values via tests

	@Test
	void contextLoads() {
	}

	@Test
	void testMilk() {
		Basket basket = new Basket();
		basket.addToBasket("Milk");
		// Assert milk is in the basket
	}

	// test invalid input (assert "item not in stock")

	// test price and promotions

}
