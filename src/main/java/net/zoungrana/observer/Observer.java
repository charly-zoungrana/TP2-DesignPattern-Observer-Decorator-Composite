package net.zoungrana.observer;

@FunctionalInterface
public interface Observer {
    void update(int newState);
}
