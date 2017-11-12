package com.iteso.nintendo.Nintendo;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iAccelerate;
import com.iteso.nintendo.Interfaces.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter{

    public Mario(){
        setCurrentPower("normal");
        setName("Mario");
        setSpeed("normal");
        setCharacterAccelerate(new AccelerateMin());
        setCharacterPower(new powerStar());
    }

    @Override
    public String performXButtonAction() {
        return "Im in the race mates!";
    }

    @Override
    public String performYButtonAction() {
        return "Lets do it";
    }

    @Override
    public String performAButtonAction() {
        return "slide";
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
        accelerationType = new AccelerateMax();
    }
}