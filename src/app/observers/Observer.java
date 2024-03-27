package app.observers;


import app.subject.Substance;

public abstract class Observer {
    protected Substance substance;
    public abstract void update();
}
