package net.zoungrana.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

    private final List<Observer> observers=new ArrayList<>();
    private int state;

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(state));
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
