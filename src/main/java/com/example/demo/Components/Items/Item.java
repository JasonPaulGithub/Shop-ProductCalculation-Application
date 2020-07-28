package com.example.demo.Components.Items;

public class Item {

    public String name;
    public Integer stack;
    public Double price;

    public Item(String itemName, Integer stack, Double price) {
        this.name = itemName;
        this.stack = stack;
        this.price = price;
    }

    public double getPrice() {
        return price * stack;
    }

    public void increaseStack() {
        this.stack++;
    }

}
