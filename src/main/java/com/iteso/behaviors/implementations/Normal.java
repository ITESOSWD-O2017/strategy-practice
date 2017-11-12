package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IAccelerate;

/**
 * Created by AlejandraSahagun on 08/11/16.
 */
public class Normal implements IAccelerate {

    /** @return String. */
    public final String accelerate() {
        return "Go go go";
    }

    /** @return String. */
    public final String decelerate() {
        return "You are losing your superpowers";
    }

    /** @return String. */
    public final String skid() {
        return "If you want to go to the left, turn to the right";
    }

    /** @return String. */
    public final String stop() {
        return "You stopped";
    }
}