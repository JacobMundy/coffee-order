package edu.iu.habahram.coffeeorder.model;

public class decaf extends Beverage {
    
        @Override
        public float cost() {
            return 2.30F;
        }
    
        @Override
        public String getDescription() {
            return "decaf";
        }
    
}
