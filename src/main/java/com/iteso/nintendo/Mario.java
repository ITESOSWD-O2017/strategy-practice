package com.iteso.nintendo;

import com.iteso.nintendo.com.iteso.impl.FastAccel;
import com.iteso.nintendo.com.iteso.impl.NormalAccel;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {

    public Mario(){
        setCurrentPower("normal");
        setName("Mario");
        setSpeed("normal");
    }

    @Override
    public String performXButtonAction() {
        decelerate();
        if (getAccelType()){
            setAcceleration(new FastAccel());
        }
        else {
            setAcceleration(new NormalAccel());
        }

        return "I´m decelerating now I am"+ getSpeed();
    }

    @Override
    public String performYButtonAction() {
        accelerate();
        setAcceleration(new NormalAccel());
        return "I´m accelerating now I am "+ getSpeed();
    }

    @Override
    public String performAButtonAction() {
        return "jump";
    }

    @Override
    public String performBButtonAction() {
        if (getCurrentPower() == "fire")
            return "fireball";
        else if (getCurrentPower() == "invincibility")
            return "dash";
        else if (getCurrentPower() == "normal")
            return "nothing";
        else
            return "error";
    }
    @Override
    public void setPower(iPower powerItem){
        if(getCurrentPower().toLowerCase()!= "normal"){
            return;
        }

        else if(powerItem.getPower().toLowerCase() == "flower"){
            powerItem.preparePower();
            setCurrentPower(powerItem.releasePower());
        }
        else if(powerItem.getPower().toLowerCase() == "star"){
            powerItem.preparePower();
            setCurrentPower(powerItem.releasePower());
            setAccelerationType(true);
            performYButtonAction();
        }
        else if(powerItem.getPower().toLowerCase() == "clear power"){
            powerItem.preparePower();
            setCurrentPower(powerItem.releasePower());
            setAccelerationType(true);
            setSpeed("normal");
        }
        else
            setCurrentPower("error");
    }
}