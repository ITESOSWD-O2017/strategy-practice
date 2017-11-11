package com.iteso.nintendo.Characters;

import com.iteso.nintendo.Beheaviors.Fast;
import com.iteso.nintendo.Characters.NintendoCharacter;
import com.iteso.nintendo.Interfaces.*;
import com.iteso.nintendo.Beheaviors.GreenShell;

public class GiantMario extends NintendoCharacter {
    public GiantMario() {
        setCurrentPower("normal");
        setName("Giant Mario ");
        setSpeed("normal");
        setPowerr(new GreenShell());
        setAcelerar(new Fast());

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
    public void setPower(String powerItem) {
        if (getCurrentPower().toLowerCase() != "normal") {
            return;
        }

        else if(powerItem.toLowerCase() == "flower"){
            setCurrentPower("fire");
        }
        else if(powerItem.toLowerCase() == "star"){
            setCurrentPower("invincibility");
            setSpeed("fast");
        }
        else if(powerItem.toLowerCase() == "clear power"){
            setCurrentPower("normal");
            setSpeed("normal");
        }
        else
            setCurrentPower("error");
    }
}
