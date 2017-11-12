package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.SlowAccelerate;

/**
 * Personaje Yoshi.
 */
public class Yoshi extends NintendoCharacter {

    /**
     * Constructor de Yoshi.
     */
    public Yoshi () {
        setCurrentAccelerate(new SlowAccelerate());
        setName("Bowser");
        setSpeed("normal");
        setCurrentAccelerate(new SlowAccelerate());
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
