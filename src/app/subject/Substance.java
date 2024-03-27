package app.subject;

import app.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Substance {
    private final List<Observer> observers = new ArrayList<>();

    private double temperature;
    private double weight;
    private String color;

    public double getTemperature() {return temperature;}
    public double getWeight() {return weight;}

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
