package net.zoungrana.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Observer 1: " + newState);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
}
