package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IAccelerate;

/**
 * Created by AlejandraSahagun on 11/11/16.
 */
public class Fast implements IAccelerate {

    /** @return String. */
    public final String accelerate() {
        return "Your speed increased by 200 percent, you are the most speed";
    }

    /** @return String. */
    public final String decelerate() {
        return "Oh no! your speed is going down";
    }

    /** @return String. */
    public final String skid() {
        return "Your laps are the best";
    }

    /** @return String. */
    public final String stop() {
        return "You have stopped";
    }
}

