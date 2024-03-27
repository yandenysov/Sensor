package app.subject;

import app.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Substance {
    private final List<Observer> observers = new ArrayList<>();

    private double temperature;

    public double getTemperature() {return temperature;}

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void attach(Observer observer) {observers.add(observer);}

    public void notifyAllObservers() {
        System.out.println("Info updated. Displaying current substance state.");
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
