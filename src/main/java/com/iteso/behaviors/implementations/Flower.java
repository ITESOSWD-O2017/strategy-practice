package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IPower;

/**
 * Class Flower.
 */
public class Flower implements IPower {
    /**
     *
     * @return status.
     */
    public final String catchPower() {
        return "Fire mode!";
    }

    /**
     *
     * @return status.
     */
    public final String throwForward() {
        return "BURN!!";
    }

    /**
     *
     * @return status.
     */
    public final String trhowBackwards() {
        return "See ya in hell!!";
    }

    /**
     *
     * @return status.
     */
    public final String retainPower() {
        return "Burn them all!!";
    }
}
