package com.iteso.nintendo;

import com.iteso.nintendo.Imple.BlueShell;
import com.iteso.nintendo.Imple.Fast;

/**
 *
 */
public class Mario extends NintendoCharacter {
    /**
     *
     */
    public Mario() {
        setCurrentPower("normal");
        setName("Mario");
        setSpeed("normal");
        setAccelerate(new Fast());
        setPoder(new BlueShell());
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
