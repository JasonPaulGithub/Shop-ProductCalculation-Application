package com.example.demo.Components.Promotions;

import com.example.demo.Components.Items.Item;

import java.util.Map;

public interface BasketPromotion {
    public double applyBasketPromotion(Map<String, Item> basketContents, double runningTotal);
}