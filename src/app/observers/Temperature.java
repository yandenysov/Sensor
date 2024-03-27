package app.observers;

import app.subject.Substance;

public class Temperature extends Observer {
    public Temperature(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Temperature: " + substance.getTemperature() + " degrees Celsius");
    }
}
