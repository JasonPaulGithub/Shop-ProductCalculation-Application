package com.example.demo.Components;

import com.example.demo.Components.Items.Item;

import java.util.*;

public class Basket {

    Map<String, Item> basketContents = new HashMap<>();

    public Map<String, Item> getBasketContents() {
        return basketContents;
    }

    public void addToBasket(String itemName) {
        Store store = Store.getInstance();
        basketContents = store.getFromShelf(itemName, basketContents);
    }

    public double getTotal() {

        double runningTotal = 0;

        for (Map.Entry<String, Item> entry : basketContents.entrySet())
            runningTotal += entry.getValue().getPrice();
        return runningTotal;
    }
}
