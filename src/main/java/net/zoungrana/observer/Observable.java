package net.zoungrana.observer;

public interface Observable {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers();
}
