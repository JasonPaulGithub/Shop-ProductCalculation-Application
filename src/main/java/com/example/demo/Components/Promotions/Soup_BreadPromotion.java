package com.example.demo.Components.Promotions;

import com.example.demo.Components.Items.Item;

import java.util.Map;

public class Soup_BreadPromotion implements BasketPromotion {

    @Override
    public double applyBasketPromotion(Map<String, Item> basketContents, double runningTotal) {

        if(basketContents.containsKey("Apples")) {
            System.out.println("Apples have 10% off their normal price this week");
            runningTotal = runningTotal - (basketContents.get("Apples").stack * 0.10);
        } else if(basketContents.containsKey("Soup") && basketContents.get("Soup").stack>=2) {
            System.out.println("Buy 2 tins of soup and get a loaf of bread for half price");
            runningTotal = runningTotal - 0.4;
        } else {
            System.out.println("(no offers available)");
        }
        return runningTotal;
    }
}
