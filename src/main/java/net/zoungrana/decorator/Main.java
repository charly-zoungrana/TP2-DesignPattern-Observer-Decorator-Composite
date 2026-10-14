package net.zoungrana.decorator;

import net.zoungrana.decorator.components.Boisson;
import net.zoungrana.decorator.components.Expresso;
import net.zoungrana.decorator.components.Sumatra;

public class Main {

    public static  void main(String[] args){

        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson=new Expresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson=new ChocolatDecorator(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson=new CaramelDecorator(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());


    }
}
