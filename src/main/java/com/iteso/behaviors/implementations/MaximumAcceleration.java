package com.iteso.behaviors.implementations;
import com.iteso.behaviors.Iaccelerate;

/**
 * Class Maximum acceleration.
 */
public class MaximumAcceleration implements Iaccelerate {
    /**
     *
     * @return status.
     */
    public final String startAccelerating() {
        return "Fast acceleration!";
    }

    /**
     *
     * @return status
     */
    public final String acceleration() {
        return "To much powerrr!";
    }

    /**
     *
     * @return status
     */
    public final String slowDown() {
        return "Slowing down!";
    }
}
