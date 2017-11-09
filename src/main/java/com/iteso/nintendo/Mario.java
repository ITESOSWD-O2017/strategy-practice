package com.iteso.nintendo;
import com.iteso.behaviors.implementations.*;
import com.iteso.behaviors.iAccelerate;
import com.iteso.behaviors.iPower;
/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class Mario extends NintendoCharacter{

    public Mario(){
        setName("Mario");
    }

    @Override
    public String performBButtonAction() {
        if (powerStatus.catchPower() == "flower")
            return "fireball";
        else if (powerStatus.catchPower() == "shell")
            return "shell";
        else if (powerStatus.catchPower() == "normal")
            return "nothing";
        else
            return "error";
    }

    public void setPower() {
        powerStatus = new NormalMode();
    }

    public void setAcceleration(){
        accelerateStatus = new NormalAcceleration();
    }
}