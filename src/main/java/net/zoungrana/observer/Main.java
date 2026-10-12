package net.zoungrana.observer;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();

        Stream.of(observer1,observer2).forEach(observable::subscribe);

        observable.subscribe(o -> {
            if(o instanceof ObservableImpl obs){
                System.out.println("+++++++++++++++++++++++++++++++++++++");
                System.out.println("Observer 3: " + obs.getState()*3);
                System.out.println("+++++++++++++++++++++++++++++++++++++");
            }
        });


        observable.setState(50);
        observable.setState(100);

        observable.unsubscribe(observer1);

        observable.setState(150);
    }
}
