package com.iteso.nintendo;
import com.iteso.behaviors.implementations.NormalMode;
import com.iteso.behaviors.implementations.SlowAcceleration;
import com.iteso.behaviors.Iaccelerate;
import com.iteso.behaviors.IPower;

/**
 * Class Bowser.
 */
public class Bowser extends NintendoCharacter {
    /**
     * default constructor.
     */
    public Bowser() {
        setName("Bowser");
    }

    /**
     * setPower.
     * @param powerItem poweritem.
     */
    private IPower power = new NormalMode();

    /**
     * acceleration.
     * @param acceleration acceleration.
     */
    private Iaccelerate acceleration = new SlowAcceleration();

    /**
     *
     * @param powerItem power.
     */
    public void setPower(final IPower powerItem) {

    }

    /**
     *
     * @param accelerationn acceleration.
     */
    public void setAcceleration(final Iaccelerate accelerationn) {

    }
}
