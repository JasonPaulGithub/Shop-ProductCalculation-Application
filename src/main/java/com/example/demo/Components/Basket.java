package com.example.demo.Components;

import com.example.demo.Components.Items.Item;

import java.util.*;

public class Basket{

    Map<String, Item> basketContents = new HashMap<>();

    public void addToBasket(String itemName){
        Store store = Store.getInstance();
        basketContents = store.getFromShelf(itemName, basketContents);
    }

}
