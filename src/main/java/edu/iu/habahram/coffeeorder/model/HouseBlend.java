package edu.iu.habahram.coffeeorder.model;

public class HouseBlend extends Beverage{

        @Override
        public float cost() {
            return 0.89F;
        }

        @Override
        public String getDescription() {
            return "House Blend Coffee";
        }
}
