package com.iteso.nintendo;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.Iaccelerate;
import com.iteso.behaviors.implementations.NormalAcceleration;
import com.iteso.behaviors.implementations.NormalMode;
/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {
    /**
     *
     * @param powerItem power.
     */
    public void setPower(final IPower powerItem) {

    }

    /**
     * acceleration.
     * @param accelerationn acceleration.
     */
    public void setAcceleration(final Iaccelerate accelerationn) {

    }

    /**
     * default constructor.
     */
    public Mario() {
        setName("Mario");
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
    private Iaccelerate acceleration = new NormalAcceleration();
}
