package com.example.demo.Components.Promotions;

import com.example.demo.Components.Items.Item;

public class BreadPromotion extends Item implements Promotion {

    public BreadPromotion(String itemName, Integer stack, Double price) {
        super(itemName, stack, price);
    }

    @Override
    public void condition() {

    }

    @Override
    public void modifier() {

    }
}
