package net.zoungrana.observer;

import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history;

    @Override
    public void update(int newState) {
        history.add(newState);

        double sum=history.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Observer 2. Moyenne= " + sum/history.size());
    }
}
