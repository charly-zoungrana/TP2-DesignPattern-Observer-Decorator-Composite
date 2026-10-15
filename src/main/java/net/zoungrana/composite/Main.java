package net.zoungrana.composite;

public class Main {
    public static void main(String[] args) {
        Folder root=new Folder("root");
        root.addChild(new File("README.md"));
        root.addChild(new File("pom.xml"));

        Folder src=(Folder) root.addChild(new Folder("src"));
        src.addChild(new File(".env"));
        src.addChild(new File("document.pdf"));
        Folder java =(Folder) src.addChild(new Folder("Java"));
        java.addChild(new File("Main.java"));
        root.print();

    }
}
