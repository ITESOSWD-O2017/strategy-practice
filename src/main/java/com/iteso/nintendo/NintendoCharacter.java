package com.iteso.nintendo;

import com.iteso.nintendo.Interfaz.iAccelerate;
import com.iteso.nintendo.Interfaz.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private String speed = null;
      private String name = null;
      private String currentPower = null;
      private iPower poder = null;
      private iAccelerate accelerate = null;



    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    public void setAcceleration(iAccelerate accelerationType) {
        setSpeed(accelerationType.accelerate());
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
    public String performBButtonAction(){
       return currentPower;
    }
    public void setPower(iPower powerItem) {
        setCurrentPower(powerItem.name());
    }

    public String getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }
    public iPower getPoder(){
        return poder;
    }

    public void setPoder(iPower poder) {
        this.poder = poder;
    }

    public iAccelerate getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(iAccelerate accelerate) {
        this.accelerate = accelerate;
    }
}
