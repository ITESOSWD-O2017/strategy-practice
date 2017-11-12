package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IPower;

/**
 * Class Normal mode.
 */
public class NormalMode implements IPower {
    /**
     *
     * @return status.
     */
    public final String catchPower() {
        return "No power!";
    }

    /**
     *
     * @return status.
     */
    public final String throwForward() {
        return "Cant throw anything!";
    }

    /**
     *
     * @return status.
     */
    public final String trhowBackwards() {
        return "Cant throw anything!";
    }

    /**
     *
     * @return status.
     */
    public final String retainPower() {
        return "No power!";
    }
}
