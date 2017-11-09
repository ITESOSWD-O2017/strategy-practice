package com.iteso.nintendo;
import com.iteso.behaviors.iPower;
import com.iteso.behaviors.implementations.NormalAcceleration;
import com.iteso.behaviors.implementations.NormalMode;
import com.iteso.behaviors.implementations.Shell;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class Luigi extends NintendoCharacter{

    public Luigi(){
        setName("Luigi ");
    }

    @Override
    public String performBButtonAction() {
        if (powerStatus.catchPower()== "fire")
            return "fireball";
        else if (powerStatus.catchPower() == "invincibility")
            return "dash";
        else if (powerStatus.catchPower() == "normal")
            return "nothing";
        else
            return "error";
    }

    public void setPower() {
        powerStatus = new NormalMode();
    }

    public void setSpeed(){
        accelerateStatus = new NormalAcceleration();
    }
}