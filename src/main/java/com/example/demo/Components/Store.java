package com.example.demo.Components;

import com.example.demo.Components.Items.Item;
import com.example.demo.Components.Promotions.ApplesPromotion;
import com.example.demo.Components.Promotions.BreadPromotion;

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
        double price = stock.get(itemName).getPrice();

        if (checkStock(itemName)) {
            if (!basket.containsKey(itemName)) {
                // newBasket gets a new item
                newBasket.put(itemName, stock.get(itemName));
            } else {
                // increment stack of item in basket
                newBasket.get(itemName).increaseStack();
            }
        } else {
            // throw "Item not in stock" with an optional null
        }
        return newBasket;
    }

    private Item newItem(String item, Integer stack, double price) {
        Item newItem = new Item(item, stack, price);
        return newItem;
    }

    public boolean checkStock(String item) {
        return stock.containsKey(item);
    }

    public Map<String, Item> setStock() {
        final Map<String, Item> inStock = new HashMap<>();

        // Normal Items
        inStock.put("Soup", newItem("Soup", 1, 0.65));
        inStock.put("Milk", newItem("Milk", 1, 1.30));

        // Promotional Items
        Item applePromotion = new ApplesPromotion("Apples", 1, 1.00);
        inStock.put("Apples", applePromotion);
        BreadPromotion breadPromotion = new BreadPromotion("Bread", 1, 0.80);
        inStock.put("Bread", breadPromotion);

        return Collections.unmodifiableMap(inStock);
    }
}

