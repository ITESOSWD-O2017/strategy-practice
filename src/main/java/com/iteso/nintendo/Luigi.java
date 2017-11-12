package com.iteso.nintendo;

import com.iteso.nintendo.Imple.Shell;
import com.iteso.nintendo.Imple.SlowAF;

/**
 *
 */
public class Luigi extends NintendoCharacter {
    /**
     *
     */
    public Luigi() {
        setCurrentPower("normal");
        setName("Luigi ");
        setSpeed("normal");
        setAccelerate(new SlowAF());
        setPoder(new Shell());
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
