package de.philipp.microwave.controller;

import de.philipp.microwave.model.Microwave;

public class MicrowaveController {

    private Microwave microwave;

    public MicrowaveController() {

    }

    public void initSystem() {
        this.microwave = new Microwave();
    }

    public void handleButtonAction (boolean isDoorOpen, boolean isLampOn, boolean isActive) {
        microwave.setDoorOpen(isDoorOpen);
        microwave.setLampOn(isLampOn);
        microwave.setActive(isActive);
        microwave.notifyObserver();
    }
}
