package com.iteso.behaviors.implementations;
import com.iteso.behaviors.Iaccelerate;

/**
 * Class Normal Acceleration.
 */
public class NormalAcceleration implements Iaccelerate {
    /**
     *
     * @return status.
     */
    public final String startAccelerating() {
        return "Normal";
    }

    /**
     *
     * @return status.
     */
    public final String acceleration() {
        return "We got this! Normal and secure acceleration!";
    }

    /**
     *
     * @return status.
     */
    public final String slowDown() {
        return "Slowing down!";
    }
}
