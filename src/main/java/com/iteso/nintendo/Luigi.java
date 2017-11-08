package com.iteso.nintendo;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter{

    public Luigi(){
        setCurrentPower("normal");
        setName("Luigi ");
        setSpeed("normal");
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
            setSpeed("fast");
        }
        else if(powerItem.getPower().toLowerCase() == "clear power"){
            powerItem.preparePower();
            setCurrentPower(powerItem.releasePower());
            setSpeed("normal");
        }
        else
            setCurrentPower("error");
    }
}