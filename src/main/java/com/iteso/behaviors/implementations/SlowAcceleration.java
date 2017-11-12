package com.iteso.behaviors.implementations;
import com.iteso.behaviors.Iaccelerate;

/**
 * Class Slow acceleration.
 */
public class SlowAcceleration implements Iaccelerate {
    /**
     *
     * @return status.
     */
    public final String startAccelerating() {
        return "Here I go!";
    }

    /**
     *
     * @return status.
     */
    public final String acceleration() {
        return "Slow acceleration!";
    }

    /**
     *
     * @return status.
     */
    public final String slowDown() {
        return "Slowing down!";
    }
}
