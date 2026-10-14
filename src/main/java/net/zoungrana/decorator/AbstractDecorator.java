package net.zoungrana.decorator;

import net.zoungrana.decorator.components.Boisson;

public abstract class AbstractDecorator extends Boisson{

    public AbstractDecorator(Boisson boisson){
        this.boisson=boisson;
    }
    protected Boisson boisson;
}
