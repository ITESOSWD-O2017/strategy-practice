package com.iteso.nintendo;

import com.iteso.Ipower.Normal;
import com.iteso.Ipower.iPower;
import com.iteso.iAccelerate.iAccelerate;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private int speed = 0;
      private String name = null;
      private iPower currentPower = null;
      private Boolean holdB=null;
        private Boolean holdY=null;
      private Boolean backwardstick=null;
      private iAccelerate acType=null;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String performXButtonAction();
    public  String performYButtonAction(){
        if (holdY){
            if((speed+=acType.accelerate())<acType.extreme())
            speed+=acType.accelerate();
            else
                speed=acType.extreme();
        }else
            if((speed+=acType.breaking())!=0)
                speed+=acType.breaking();
            else
                speed=0;
        return "speed is "+speed+ " km/h";
    }
    public abstract String performAButtonAction();

    public String performBButtonAction(){
        String result=null;
            if (holdB)
                result= getCurrentPower().bePrepared();
            else if(backwardstick){
                result=getCurrentPower().throwBackwards();
                setCurrentPower(new Normal());}
            else{
                result=getCurrentPower().performAction();
                setCurrentPower(new Normal());
            }
            return result;
    }

    //public abstract void setPower(iPower powerItem);


    public iPower getCurrentPower() {
        return currentPower;
    }
    public void setAcType(iAccelerate acType){this.acType=acType;}
    public void setCurrentPower(iPower currentPower) {
        this.currentPower = currentPower;
    }
}
