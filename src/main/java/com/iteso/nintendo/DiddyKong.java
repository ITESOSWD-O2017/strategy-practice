package com.iteso.nintendo;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.Iaccelerate;
import com.iteso.behaviors.implementations.MaximumAcceleration;
import com.iteso.behaviors.implementations.NormalMode;

/**
 * Class Diddy Kong.
 */
public class DiddyKong extends NintendoCharacter {
    /**
     * default constructor.
      */
    public DiddyKong() {
        setName("Diddy");
        setCurrentPower("Shell");
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
    private Iaccelerate acceleration = new MaximumAcceleration();

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
