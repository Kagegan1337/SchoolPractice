package de.philipp.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observers;
    private boolean changed = false;

    public Observable() {
        observers = new ArrayList<>();
    }

    public synchronized void addObserver(Observer o) throws NullPointerException{
        if(o == null) {
            throw new NullPointerException();
        }
        if(!observers.contains(o)) {
            observers.add(o);
        }
    }

    public synchronized void removeObserver(Observer o) {observers.remove(o); }

    public synchronized void deleteObservers() {observers.clear();}

    public void notifyObserver() {notifyObserver(null);}

    public void notifyObserver(Object arg) {
        if(!changed) {
            return;
        }
        clearChanged();
        for(Observer o : observers) {
            o.update(this, arg);
        }
    }

    protected void setChanged() {
        changed = true;
    }

    public boolean hasChanged() {return changed;}

    protected synchronized void clearChanged() {changed = false;}

}
