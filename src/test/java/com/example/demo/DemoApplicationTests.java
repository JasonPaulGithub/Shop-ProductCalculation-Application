package com.example.demo;

import com.example.demo.Components.Basket;
import com.example.demo.Components.Items.Item;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void addItem() {
		Basket basket = new Basket();
		basket.addToBasket("Milk");
		assertTrue (basket.getBasketContents().containsKey("Milk"));
	}

	// Test each item, multiple stacks of one, multiple items, and their stacks, and totals

	// test invalid input (assert "item not in stock")

	// test price and promotions

}
