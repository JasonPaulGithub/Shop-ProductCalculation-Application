package com.example.demo.Components;

import com.example.demo.Components.Items.Item;

import java.util.*;

public class Basket{

    Map<String, Item> basketContents = new HashMap<>();

    public boolean checkBasketContains(String item) {
        return basketContents.containsKey(item);
    }

    public void addToBasket(String itemName){
        Store store = Store.getInstance();
        basketContents = store.getFromShelf(itemName, basketContents);
    }

    public void incrementItemStack(String item) {
        basketContents.get(item).increaseStack();
    }

}
