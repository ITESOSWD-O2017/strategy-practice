package com.iteso.characters;

import com.iteso.behaviors.implementations.Normal;
import com.iteso.behaviors.implementations.RedMushroom;
import com.iteso.behaviors.implementations.Star;
import com.iteso.nintendo.NintendoCharacter;

public class Joshi  extends NintendoCharacter {

    public Joshi () {
        setName("Joshi");
        setCurrentPower(new Star());
        setAcceleration(new RedMushroom());
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
