package com.iteso.nintendo;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private String speed = null;
      private String name = null;
      private String currentPower = null;
      private boolean accel = false;
      private boolean accelerationType = false;

    public String getSpeed() {
        return speed;
    }

    public void accelerate(){
        this.accel=true;
    }
    public void decelerate(){
        this.accel=false;
    }
    public void setAcceleration(iAccelerate accelerationType){
       if (accel){
           setSpeed(accelerationType.accel(this.speed));
       }
       else{
           setSpeed(accelerationType.decel(this.speed));
       }
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

    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    public abstract String performBButtonAction();

    public abstract void setPower(iPower powerItem);
    public void setAccelerationType(boolean type){
        this.accelerationType=type;
    }
    public boolean getAccelType(){
        return this.accelerationType;
    }
    public String getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }
}
