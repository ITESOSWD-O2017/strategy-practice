package com.iteso.nintendo;


/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private Iaccelerate speed = null;
      private String name = null;
      private Ipower currentPower = null;


    public Iaccelerate getSpeed() {
        return speed;
    }

    public void setSpeed(Iaccelerate speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    public abstract String performBButtonAction();

    public abstract void setPower(Ipower powerItem);


    public Ipower getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(Ipower currentPower) {
        this.currentPower = currentPower;
    }
}
