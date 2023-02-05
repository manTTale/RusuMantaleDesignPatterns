package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

class Internship {
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
