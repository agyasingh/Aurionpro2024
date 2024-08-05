package com.aurionpro.decorator.model;

public class GoldenHat extends HatDecorator {
    public GoldenHat(IHat hat) {
        super(hat);
    }

    public double getPrice() {
        return 500 + super.getPrice();
    }

    @Override
    public String getName() {
        return "Golden " + super.getName();
    }

    @Override
    public String getDescription() {
        return "Golden " + super.getDescription();
    }
}
