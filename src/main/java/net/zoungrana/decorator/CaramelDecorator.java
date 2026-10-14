package net.zoungrana.decorator;

import net.zoungrana.decorator.components.Boisson;

public class CaramelDecorator extends AbstractDecorator{

    public CaramelDecorator(Boisson boisson){
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}
