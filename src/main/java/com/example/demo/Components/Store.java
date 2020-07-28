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
        Map<String, Item> newBasket = basket;

        if (checkStock(itemName)) {
            if (!basket.containsKey(itemName)) {
                // newBasket gets a new item
                newBasket.put(itemName, stock.get(itemName));
            } else {
                // increment stack of item in basket
                newBasket.get(itemName).increaseStack();
            }
        } else {
            System.out.println("Item not in stock.");
            return newBasket;
        }

        return newBasket;
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

        // Promotion on Items
        Item applePromotion = new ApplesItemPromotion("Apples", 1, 1.00);
        inStock.put("Apples", applePromotion);

        return Collections.unmodifiableMap(inStock);
    }
}

