package com.iteso.nintendo;

import com.iteso.nintendo.Imple.Slow;
import com.iteso.nintendo.Imple.Star;

/**
 *
 */
public class Warluigi extends NintendoCharacter {
    /**
     *
     */
    public Warluigi() {
        setCurrentPower("normal");
        setName("Warluigi");
        setSpeed("normal");
        setAccelerate(new Slow());
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
