package com.iteso.nintendo;

import com.iteso.nintendo.Imple.Fast;
import com.iteso.nintendo.Imple.Star;

/**
 *
 */
public class Bowser extends NintendoCharacter {
    /**
     *
     */
    public Bowser() {
        setCurrentPower("normal");
        setName("Bowser");
        setSpeed("fast");
        setAccelerate(new Fast());
        setPoder(new Star());
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

}
