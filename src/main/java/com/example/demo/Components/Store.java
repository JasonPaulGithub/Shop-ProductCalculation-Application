package com.example.demo.Components;

import com.example.demo.Components.Items.Item;
import com.example.demo.Components.Promotions.ApplesItemPromotion;

import java.util.*;

public class Store {

    public static final Store INSTANCE = new Store();
    public final Map<String, Item> stock = setStock();

    private Store() {
        // Singleton: private constructor
    }

    public static Store getInstance() {
        return INSTANCE;
    }

    public  Map<String, Item> getFromShelf(String itemName, final  Map<String, Item> basket) {

        if (checkStock(itemName)) {
            if (!basket.containsKey(itemName)) {
                // newBasket gets a new item
                basket.put(itemName, stock.get(itemName));
            } else {
                // increment stack of item in basket
                basket.get(itemName).increaseStack();
            }
        } else {
            System.out.println("Item not in stock.");
            return basket;
        }

        return basket;
    }

    private Item newItem(String item, Integer stack, double price) {
        return new Item(item, stack, price);
    }

    public boolean checkStock(String item) {
        return stock.containsKey(item);
    }

    public Map<String, Item> setStock() {
        final Map<String, Item> inStock = new HashMap<>();

        // Normal Items
        inStock.put("Soup", newItem("Soup", 1, 0.65));
        inStock.put("Milk", newItem("Milk", 1, 1.30));
        inStock.put("Bread",newItem("Bread", 1, 0.80));
        inStock.put("Apples",newItem("Apples", 1, 1.00));

        // Here is how to put a Promotion on individual items before it is send to the basket.
        // It wasn't asked for but I wanted to keep it in, just for fun.

        // Promotional Items
        //Item applePromotion = new ApplesItemPromotion("Apples", 1, 1.00);
        //inStock.put("Apples", applePromotion);

        return Collections.unmodifiableMap(inStock);
    }
}

