package com.example.demo.Components;

import com.example.demo.Components.Items.Item;
import com.example.demo.Components.Promotions.Soup_BreadPromotion;

import java.util.*;

public class Basket extends Soup_BreadPromotion {

    Map<String, Item> basketContents = new HashMap<>();

    public Map<String, Item> getBasketContents() {
        return basketContents;
    }

    public void addToBasket(String itemName) {
        System.out.println(itemName + " added to the basket.");
        Store store = Store.getInstance();
        basketContents = store.getFromShelf(itemName, basketContents);
    }

    public double getTotal() {
        double runningTotal = 0;

        for (Map.Entry<String, Item> entry : basketContents.entrySet()){
            runningTotal += entry.getValue().getPrice();
        }

        System.out.println("Subtotal: " + runningTotal);
        runningTotal = applyBasketPromotion(basketContents,runningTotal);
        System.out.println("Total: £" + runningTotal);
        System.out.println("----------------------------------");
        return runningTotal;
    }
}
