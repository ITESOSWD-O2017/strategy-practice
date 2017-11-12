package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.VeryFastAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;
import com.iteso.nintendo.items.TunderPower;

/**
 * Personaje Luigi.
 */
public class Luigi extends NintendoCharacter{

    /**
     * Constructor de Luigi.
     */
    public Luigi(){
        setPower(new StarPower());
        setName("Luigi ");
        setSpeed("normal");
        setCurrentAccelerate(new VeryFastAccelerate());
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