package de.philipp.microwave.model;

import de.philipp.observer.Observable;

public class Microwave extends Observable {


    private boolean isDoorOpen = false;
    private boolean isLampOn = false;
    private boolean isActive = false;
    private boolean isTimerOn = false;

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;
        setChanged();
    }

    public boolean isLampOn() {
        return isLampOn;
    }

    public void setLampOn(boolean lampOn) {
        isLampOn = lampOn;
        setChanged();
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
        setChanged();
    }

    public boolean isTimerOn() {
        return isTimerOn;
    }

    public void setTimerOn(boolean timerOn) {
        isTimerOn = timerOn;
        setChanged();
    }
}
