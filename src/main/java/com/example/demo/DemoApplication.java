package com.example.demo;

import com.example.demo.Components.Basket;
import org.springframework.boot.SpringApplication;

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//TODO: Get tests to run (fix tests)
		Basket basket = new Basket();
		basket.addToBasket("Milk");
		basket.addToBasket("Milk");
		basket.addToBasket("Milk");
		basket.addToBasket("Milk");

	}

}
