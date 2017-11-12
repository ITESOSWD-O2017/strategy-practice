package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.VeryFastAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;


/**
 * Personaje Birdo.
 */
public class Birdo extends NintendoCharacter {

    /**
     * Constructor de Birdo.
     */
    public Birdo () {
        setCurrentAccelerate(new VeryFastAccelerate());
        setName("Birdo");
        setPower(new ShellPower());
        setSpeed("normal");
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
        return null;
    }


}
