package com.iteso.nintendo.com.iteso.impl;

import com.iteso.nintendo.IAccelerate;

/**
 * Class fast accel.
 */
public class FastAccel implements IAccelerate {
    /**
     *
     * @param speed es la velocidad.
     * @return a que velocidad va a ir.
     */
    public final String accel(final String speed) {
        if (speed.toLowerCase() == "normal") {
            return "fast";
        } else if (speed.toLowerCase() == "not that fast") {
            return "fast";
        } else if (speed.toLowerCase() == "fast") {
            return "fast";
        } else {
            return speed;
        }
    }
    /**
     *
     * @param speed es la velocidad.
     * @return a que velocidad va a ir.
     */
    public final String decel(final String speed) {
        if (speed.toLowerCase() == "normal") {
            return "normal";
        } else if (speed.toLowerCase() == "not that fast") {
            return "normal";
        } else if (speed.toLowerCase() == "fast") {
            return "normal";
        } else {
            return speed;
        }
    }
}
