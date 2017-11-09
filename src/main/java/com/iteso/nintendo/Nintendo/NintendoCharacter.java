package com.iteso.nintendo.Nintendo;

import com.iteso.nintendo.Interfaces.iAccelerate;
import com.iteso.nintendo.Interfaces.iPower;


/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
    private String speed = null;
    private String name = null;
    private String currentPower = null;
    protected iPower characterPower = null;
    private iPower powerItem = null;
    protected iAccelerate characterAccelerate = null;
    protected iAccelerate accelerationType = null;



    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    public void setAcceleration(iAccelerate accelerationType) {
        this.accelerationType = accelerationType;
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
        this.powerItem = powerItem;
    }

    public String getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(String currentPower) {
        this.currentPower = currentPower;
    }
    public iPower getcharacterPower(){
        return characterPower;
    }

    public void setCharacterPower(iPower characterPower) {
        this.characterPower = characterPower;
    }

    public iAccelerate getCharacterAccelerate() {
        return characterAccelerate;
    }

    public void setCharacterAccelerate(iAccelerate characterAccelerate) {
        this.characterAccelerate = characterAccelerate;
    }
}