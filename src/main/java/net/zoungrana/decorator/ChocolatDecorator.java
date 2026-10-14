package net.zoungrana.decorator;

import net.zoungrana.decorator.components.Boisson;

public class ChocolatDecorator extends AbstractDecorator{

    public ChocolatDecorator(Boisson boisson){
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }

    @Override
    public double cout() {
        return 1.2 + boisson.cout();
    }
}
