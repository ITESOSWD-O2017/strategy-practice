package com.iteso.nintendo.Nintendo;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter{

    public Luigi(){
        setCurrentPower("normal");
        setName("Luigi ");
        setSpeed("normal");
        setCharacterAccelerate(new AccelerateMax());
        setCharacterPower(new powerBanana());
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
    public void setPower(iPower characterPower) {
      characterPower = new powerBanana();
    }

    public void setAcceleration(iAccelerate accelerationType) {
        accelerationType = new AccelerateMin();
    }
}