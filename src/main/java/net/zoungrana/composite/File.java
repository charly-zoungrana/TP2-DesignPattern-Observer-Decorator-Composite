package net.zoungrana.composite;

public class File extends Component{

    public File(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tabs()+"Fichier: "+name);
    }
}
