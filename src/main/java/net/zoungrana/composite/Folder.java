package net.zoungrana.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    List<Component> components=new ArrayList<>();

    public Folder(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tabs()+"Dossier: "+name);
        components.forEach(Component::print);
    }

    public Component addChild(Component component){
        component.level=this.level+1;
        components.add(component);
        return component;
    }


}
