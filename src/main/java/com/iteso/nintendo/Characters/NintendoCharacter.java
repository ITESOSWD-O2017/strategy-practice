package com.iteso.nintendo.Characters;

import com.iteso.nintendo.Interfaces.iAccelerate;
import com.iteso.nintendo.Interfaces.iPower;


/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private String speed = null;
      private String name = null;
      private String currentPower = null;
      private iPower powerr = null;
      private iAccelerate acelerar = null;



    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcceleration(iAccelerate accelerationType) {
        setSpeed(accelerationType.accelerate());
    }
    public void setAccelerate(iAccelerate acelerar) {
        this.acelerar = acelerar;
    }

    public void setPower(iPower powerItem) {
        setCurrentPower(powerItem.name());
    }


    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    public abstract String performBButtonAction();

    public abstract void setPower(String powerItem);


    public String getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }

    public iAccelerate getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(iAccelerate acelerar){
        this.acelerar = acelerar;
    }

    public iPower getPowerr(){
        return powerr;
    }

    public void setPowerr(iPower powerr) {
        this.powerr = powerr;
    }

}











