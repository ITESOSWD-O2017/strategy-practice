package com.iteso.nintendo;

import com.iteso.nintendo.accelerate.implementations.Fast;
import com.iteso.nintendo.powerup.implementations.Normal;
import com.iteso.nintendo.powerup.implementations.Star;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter{

    public Luigi(){
        setCurrentPower(new Normal());
        setName("Luigi");
        setSpeed(new com.iteso.nintendo.accelerate.implementations.Normal());
    }

    @Override
    public String performXButtonAction() {
        return "Dash";
    }

    @Override
    public String performYButtonAction() {
        getCurrentPower().backThrow();
        return "Back Throw";
    }

    @Override
    public String performAButtonAction() {
        return "jump";
    }

    @Override
    public String performBButtonAction() {
        getCurrentPower().frontThrow();
        return "Front Throw";
    }

    @Override
    public void setPower(Ipower powerItem) {
        if (getCurrentPower().getItems() > 0) {
            return;
        }
        else if(powerItem.getClass() == Star.class){
            setSpeed(new Fast());
        }
        else if(powerItem.getClass() == Normal.class){
            setSpeed(new com.iteso.nintendo.accelerate.implementations.Normal());
        }

        setCurrentPower(powerItem);
    }
}