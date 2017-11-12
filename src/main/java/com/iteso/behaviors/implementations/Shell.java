package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IPower;

/**
 * Class Shell.
 */
public class Shell implements IPower {
    /**
     *
     * @return status.
     */
    public final String catchPower() {
        return "I have a shell!";
    }

    /**
     *
     * @return status.
     */
    public final String throwForward() {
        return "I will Knock you out!";
    }

    /**
     *
     * @return status.
     */
    public final String trhowBackwards() {
        return "Shell power!";
    }

    /**
     *
     * @return status.
     */
    public final String retainPower() {
        return "Fear my shell!";
    }
}
