package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IPower;

/**
 * Class Banana.
 */
public class Banana implements IPower {
    /**
     *
     * @return status.
     */
    public final String catchPower() {
        return "Banana Power!";
    }

    /**
     *
     * @return status.
     */
    public final String throwForward() {
        return "Here goes a Banana!";
    }

    /**
     *
     * @return status.
     */
    public final String trhowBackwards() {
        return "Watch out for the banana!";
    }

    /**
     *
     * @return status.
     */
    public final String retainPower() {
        return "Preparing banana!";
    }
}
