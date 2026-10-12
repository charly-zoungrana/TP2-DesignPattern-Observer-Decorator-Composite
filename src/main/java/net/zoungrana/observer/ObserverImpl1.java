package net.zoungrana.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable o) {
        if(o instanceof ObservableImpl obs){
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("Observer 1: "+obs.getState() );
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }
    }
}
