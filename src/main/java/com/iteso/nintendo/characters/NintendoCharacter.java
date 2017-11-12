package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.iAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;
import com.iteso.nintendo.items.TunderPower;
import com.iteso.nintendo.items.iPower;

/**
 * Clase abstracta de personajes.
 */
public abstract class NintendoCharacter {
    /**
     * Atributo de velocidad.
     */
    private String speed = null;
    /**
     * Nombre del personaje.
     */
    private String name = null;

    /**
     * Poder actual.
     */
    private iPower currentPower = null;
    /**
     * Aceleracion actual.
     */
    private iAccelerate currentAccelerate = null;


    /**
     * @return String velocidad del corredor.
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * @param speed La velocidad a cambiar del corredor.
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**
     * @return String El nombre del corredor.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name el nuemvo nombre del corredor.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return La accion realizada al presionar X.
     */
    public abstract String performXButtonAction();
    /**
     * @return La accion realizada al presionar Y.
     */
    public abstract String performYButtonAction();
    /**
     * @return La accion realizada al presionar A.
     */
    public abstract String performAButtonAction();

    /**
     * @return La accion realizada al presionar B.
     */
    public String performBButtonAction() {
        {
            if (getCurrentPower() instanceof ShellPower)
                return "shell";
            else if (getCurrentPower() instanceof StarPower)
                return "star";
            else if (getCurrentPower() instanceof TunderPower)
                return "tunder";
            else
                return "error";
        }
    };


    /**
     * @return el poder actual del jugador.
     */
    public iPower getCurrentPower() {
        return currentPower;
    }

    /**
     * @param currentPower Poder recogido del jugador.
     */
    public void setPower(iPower currentPower) {
        this.currentPower = currentPower;
    }

    /**
     * @return Acceleración actual del jugador.
     */
    public iAccelerate getCurrentAccelerate() {
        return currentAccelerate;
    }

    /**
     * @param currentAccelerate Nueva aceleracion del jugador.
     */
    public void setCurrentAccelerate(iAccelerate currentAccelerate) {
        this.currentAccelerate = currentAccelerate;
    }
}
