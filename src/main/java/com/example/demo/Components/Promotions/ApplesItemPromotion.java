package com.example.demo.Components.Promotions;

import com.example.demo.Components.Items.Item;

public class ApplesItemPromotion extends Item implements ItemPromotion {

    // We can apply a discount from the Store, or from the basket.

    public ApplesItemPromotion(String itemName, Integer stack, Double price) {
        super(itemName, stack, price);
        if (condition()){
            modifier();
        }
    }

    @Override
    public boolean condition() {
        return true;
    }

    @Override
    public void modifier() {
        this.price =  this.price * 0.9;
    }
}
