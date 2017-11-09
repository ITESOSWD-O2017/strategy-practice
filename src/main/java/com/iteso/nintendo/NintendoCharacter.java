package com.iteso.nintendo;
import com.iteso.behaviors.iAccelerate;
import com.iteso.behaviors.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private String name = null;
      private String speed = null;
      private String currentPower = null;
      protected iAccelerate accelerateStatus;
      protected iPower powerStatus;

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String Acceleration() {
        return accelerateStatus.acceleration();
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

    public abstract void setPower(iPower powerItem);
    public abstract void setAcceleration(iAccelerate acceleration);


    public iPower getCurrentPower() {
        return powerStatus;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }

}
