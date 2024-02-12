package edu.iu.habahram.coffeeorder.model;

public class Espresso extends Beverage {

    @Override
    public float cost() {
        return 2.30F;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
