package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IAccelerate;

/**
 * Created by AlejandraSahagun on 11/11/16.
 */
public class Slow implements IAccelerate {

    /** @return String. */
    public final String accelerate() {
        return "Woo woo woooooo";
    }

    /** @return String. */
    public final String decelerate() {
        return "Oh no!";
    }

    /** @return String. */
    public final String skid() {
        return "If you want to go to the left, turn to the right";
    }

    /** @return String. */
    public final String stop() {
        return "You have stopped";
    }
}
