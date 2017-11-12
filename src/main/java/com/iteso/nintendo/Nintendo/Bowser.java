package com.iteso.nintendo.Nintendo;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;

public class Bowser extends NintendoCharacter{

    public Bowser(){
        setCurrentPower("normal");
        setName("Bowser");
        setSpeed("normal");
        setCharacterAccelerate(new AccelerateNitro());
        setCharacterPower(new powerTurtle());
    }

    @Override
    public String performXButtonAction() {
        return "Im going to win";
    }

    @Override
    public String performYButtonAction() {
        return "Im super fast";
    }

    @Override
    public String performAButtonAction() {
        return "Nobody can compare to me";
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
