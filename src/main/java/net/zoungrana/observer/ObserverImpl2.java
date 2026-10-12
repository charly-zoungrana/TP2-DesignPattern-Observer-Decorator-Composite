package net.zoungrana.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private final List<Integer> history=new ArrayList<>();

    @Override
    public void update(Observable o) {

        if(o instanceof ObservableImpl obs){

            if(history.size()<100){
                history.add(obs.getState());

                double sum=history.stream()
                        .mapToInt(Integer::intValue)
                        .sum();

                System.out.println("+++++++++++++++++++++++++++++++++++++");
                System.out.println("Observer 2. Moyenne= " + sum/history.size());
                System.out.println("Observer 2. Historique= " + history );
                System.out.println("+++++++++++++++++++++++++++++++++++++");
            }

        }
    }
}
