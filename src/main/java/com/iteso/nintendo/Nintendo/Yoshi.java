package com.iteso.nintendo.Nintendo;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;

public class Yoshi extends NintendoCharacter{

    public Yoshi(){
        setCurrentPower("normal");
        setName("Yoshi");
        setSpeed("normal");
        setCharacterAccelerate(new AccelerateMin());
        setCharacterPower(new powerStar());
    }

    @Override
    public String performXButtonAction() {
        return "Lets do this thing";
    }

    @Override
    public String performYButtonAction() {
        return "Im running faster";
    }

    @Override
    public String performAButtonAction() {
        return "Im slowing my speed";
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
