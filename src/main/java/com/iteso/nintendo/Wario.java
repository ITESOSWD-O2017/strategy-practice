package com.iteso.nintendo;


import com.iteso.nintendo.Imple.AlmostFast;
import com.iteso.nintendo.Imple.Flower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Wario extends NintendoCharacter {
    /**
     *
     */
    public Wario() {
        setCurrentPower("normal");
        setName("Wario");
        setSpeed("normal");
        setAccelerate(new AlmostFast());
        setPoder(new Flower());
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
