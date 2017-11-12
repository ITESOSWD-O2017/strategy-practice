package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.FastAccelerate;
import com.iteso.nintendo.items.ShellPower;

/**
 * Personaje Bowser.
 */
public class Bowser extends NintendoCharacter {

    /**
     * Constructor de Bowser.
     */
    public Bowser(){
        setPower(new ShellPower());
        setName("Bowser");
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
        return null;
    }

}
