package com.iteso.nintendo;

import com.iteso.behaviors.iAccelerate;
import com.iteso.behaviors.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
    private String name = null;
    //Agregar variables iAcelerate y iPower
    protected iAccelerate acceleration = null;
    protected iPower currentPower = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Agregar los getters y setters de iAcelerate
    public iAccelerate getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(iAccelerate acceleration) {
        this.acceleration = acceleration;
    }

    //Modificar el setPower para que sea el de iPower
    public iPower getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(iPower currentPower) {
        this.currentPower = currentPower;
    }

    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    public abstract String performBButtonAction();

}
