package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IPower;

/**
 * Created by AlejandraSahagun on 08/11/16.
 */
public class Star implements IPower {

    /** @return String. */
    public final String getPower() {
        return "I'm amazing and invincible!";
    }

    /** @return String. */
    public final String usePower() {
        return "Get out of the way";
    }

    /** @return String. */
    public final String losePower() {
        return "They come after us D:";
    }

    /** @return String. */
    public final String getPowerDescription() {
        return "Star"; }

}
