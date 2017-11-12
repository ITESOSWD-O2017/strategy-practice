package com.iteso.nintendo.Nintendo;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;

public class DonkeyKong extends NintendoCharacter{

    public DonkeyKong(){
        setCurrentPower("normal");
        setName("Donkey Kong");
        setSpeed("normal");
        setCharacterAccelerate(new AccelerateMax());
        setCharacterPower(new powerBanana());
    }

    @Override
    public String performXButtonAction() {
        return "Lets go";
    }

    @Override
    public String performYButtonAction() {
        return "Im running fast";
    }

    @Override
    public String performAButtonAction() {
        return "Im slowing down";
    }

    @Override
    public String performBButtonAction() {
        if (getCurrentPower() == "fire")
            return "fireball";
        else if (getCurrentPower() == "invincibility")
            return "dash";
        else if (getCurrentPower() == "normal")
            return "Ja ja loser!";
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
