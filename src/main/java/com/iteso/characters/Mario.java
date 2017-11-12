package com.iteso.characters;

import com.iteso.behaviors.implementations.Normal;
import com.iteso.behaviors.implementations.RedTurtle;
import com.iteso.nintendo.NintendoCharacter;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {

    /** Constructor. */
    public Mario() {
        setName("Mario");
        setCurrentPower(new RedTurtle());
        setAcceleration(new Normal());
    }

    @Override
    public final String performXButtonAction() {
        return null;
    }

    @Override
    public final String performYButtonAction() {
        return null;
    }

    @Override
    public final String performAButtonAction() {
        return "jump";
    }

    @Override
    public final String performBButtonAction() {
        if (getCurrentPower().getPowerDescription() == "Flower") {
            return "fireball";
        } else if (getCurrentPower().getPowerDescription() == "RedTurtle") {
            return "shell";
        } else if (getCurrentPower().getPowerDescription() == "Star") {
            return "invincibility";
        } else if (getCurrentPower().getPowerDescription() == "Nothing") {
            return "nothing";
        } else {
            return "error";
        }
    }
}
