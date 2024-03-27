package app;

import app.observers.Temperature;
import app.observers.Weight;
import app.observers.Color;
import app.subject.Substance;

public class Main {
    public static void main(String[] args) {
        Substance substance = new Substance();

        new Weight(substance);
        new Color(substance);
        new Temperature(substance);

        System.out.println("Test One. Temperature set to -5 C");
        substance.setTemperature(-5);

        System.out.println("\nTest Two. Temperature set to 10 C");
        substance.setTemperature(10);
    }
}
