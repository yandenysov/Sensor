package app.observers;

import app.subject.Substance;

public class Color extends Observer {

    public Color(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        double temperature = substance.getTemperature();

        if (temperature <= 0) {
            System.out.println("Color: White");
        }
        else System.out.println("Color: Black");
    }
}
