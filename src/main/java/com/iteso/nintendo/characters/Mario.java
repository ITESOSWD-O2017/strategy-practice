package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.FastAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;
import com.iteso.nintendo.items.TunderPower;
import com.iteso.nintendo.items.iPower;

/**
 * Personaje Mario.
 */
public class Mario extends NintendoCharacter {

    /**
     * Constructor de Mario.
     */
    public Mario(){
        setPower(new ShellPower());
        setName("Mario");
        setSpeed("normal");
        setCurrentAccelerate(new FastAccelerate());
    }

    /**
     *
     * @return String aun no devuelve nada
     */
    public String performXButtonAction() {
        return null;
    }

    /**
     *
     * @return String aun no devuelve nada
     */
    public String performYButtonAction() {
        return null;
    }

    /**
     *
     * @return String aun no devuelve nada
     */
    public String performAButtonAction() {
        return "jump";
    }


}