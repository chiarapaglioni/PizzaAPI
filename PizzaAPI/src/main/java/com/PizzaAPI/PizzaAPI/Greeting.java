package com.PizzaAPI.PizzaAPI;

public class Greeting {

    private final long id;
    private final String content;
    private final double price;
    private final boolean vegetarian;

    public Greeting(long id, String content, double price, boolean vegetarian) {
        this.id = id;
        this.content = content;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegeterian() {
        return vegetarian;
    }
}