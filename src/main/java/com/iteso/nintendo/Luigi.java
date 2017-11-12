package com.iteso.nintendo;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.Iaccelerate;
import com.iteso.behaviors.implementations.NormalMode;
import com.iteso.behaviors.implementations.NormalAcceleration;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter {
    /**
     * default constructor.
     */
    public Luigi() {
        setName("Luigi ");
    }

    /**
     * setPower.
     * @param powerItem poweritem.
     */
    private IPower power = new NormalMode();

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

    /**
     * acceleration.
     * @param accelerationn acceleration.
     */
    private Iaccelerate acceleration = new NormalAcceleration();
}
