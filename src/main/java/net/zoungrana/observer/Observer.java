package net.zoungrana.observer;

@FunctionalInterface
public interface Observer {
    void update(Observable o);
}
