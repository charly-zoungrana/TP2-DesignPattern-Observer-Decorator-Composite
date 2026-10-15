package net.zoungrana.composite;

public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name){
        this.name=name;
        level=0;
    }

    public abstract void print();

    protected String tabs(){
        StringBuilder tabs= new StringBuilder();
        for(int i=0;i<level;i++){
            tabs.append("\t");
        }

        return tabs.toString();
    }
}
