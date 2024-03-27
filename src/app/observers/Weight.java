package app.observers;

import app.subject.Substance;

public class Weight extends Observer {

    public Weight(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        double temperature = substance.getTemperature();
        if (temperature <= 0) {
            System.out.println("Weight: " + 1 + " gram");
        }
        else System.out.println("Weight: " + temperature * 2 + " grams");
    }
}
