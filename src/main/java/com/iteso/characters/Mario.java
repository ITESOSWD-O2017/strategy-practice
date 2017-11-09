package com.iteso.characters;

import com.iteso.behaviors.implementations.Normal;
import com.iteso.behaviors.implementations.RedTurtle;
import com.iteso.nintendo.NintendoCharacter;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {

    public Mario() {
        setName("Mario");
        setCurrentPower(new RedTurtle());
        setAcceleration(new Normal());
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
        if (currentPower.getPower() == "Flower")
            return "fireball";
        else if (currentPower.getPower() == "RedTurtle")
            return "shell";
        else if (currentPower.getPower() == "Star")
            return "nothing";
        else if (currentPower.getPower() == "Normal")
            return "nothing";
        else
            return "error";
    }
}