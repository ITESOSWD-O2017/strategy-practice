package com.iteso;

import com.iteso.behaviors.iPower;
import com.iteso.behaviors.implementations.NormalPower;
import com.iteso.behaviors.implementations.NormalSpeed;
import com.iteso.nintendo.NintendoCharacter;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter {

    public Luigi(){
        setName("Luigi");
    }

    @Override
    public String performXButtonAction() {
        return null;
    }

    @Override
    public String performYButtonAction() {
        return null;
    }

    @Override
    public String performAButtonAction() {
        return "jump";
    }

    @Override
    public String performBButtonAction() {
        if (currentPower.getPower() == "fire")
            return "fireball";
        else if (currentPower.getPower() == "invincibility")
            return "dash";
        else if (currentPower.getPower() == "normal")
            return "nothing";
        else
            return "error";
    }

    public void setPower() {
        currentPower = new NormalPower();
    }

    public void setAccelerate() {
        currentAccelerate = new NormalSpeed();
    }

}