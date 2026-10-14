package net.zoungrana.decorator.components;

public class Sumatra extends Boisson{

    public Sumatra(){
        description="Sumatra";
    }
    @Override
    public double cout() {
        return 6;
    }
}
