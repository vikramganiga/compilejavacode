package com.core.java8.ex1;

public class Dish {
    private final String name;
    private final boolean veg;
    private final int calories;
    private Type type;

    public Dish(String name, boolean veg, int calories, Type type) {
        this.name = name;
        this.veg = veg;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVeg() {
        return veg;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    public enum Type {
        MEAT, FISH, OTHER
    }

}
