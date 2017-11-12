package com.iteso.nintendo;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.Iaccelerate;
import com.iteso.behaviors.implementations.Banana;
import com.iteso.behaviors.implementations.MaximumAcceleration;

/**
 * Class Koopa.
 */
public class KoopaTroopa extends NintendoCharacter {
    /**
     * default constructor.
     */
    public KoopaTroopa() {
        setName("Koopa");
        setCurrentPower("Banana");
    }
    /**
     * setPower.
     * @param powerItem poweritem.
     */
    private IPower power = new Banana();

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
