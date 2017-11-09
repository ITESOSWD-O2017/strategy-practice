package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.SlowSpeed;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Toad extends NintendoCharacter {
    /**
     * Slow speed param.
     */
    private IAccelerate acceleration = new SlowSpeed();
    /**
     * Constructor.
     */
    public Toad() {
        setAccelerate(this.acceleration);
        setName("Toad");
    }
    /**
     * Setting up power.
     * @param power receives a power.
     * @return end.
     */
    public final String setToadPower(final IPower power) {
        if (power == null) {
            return "Please assign a power";
        } else {
            setPower(power);
            return "OK";
        }
    }
}
