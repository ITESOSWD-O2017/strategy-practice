package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IPower;

/**
 * Created by AlejandraSahagun on 08/11/16.
 */
public class RedTurtle implements IPower {

    /** @return String. */
    public final String getPower() {
        return "My power is amazing";
    }

    /** @return String. */
    public final String usePower() {
        return "I will hit the enemy";
    }

    /** @return String. */
    public final String losePower() {
        return "Be careful, you are unprotected";
    }

    /** @return String. */
    public final String getPowerDescription() {
        return "RedTurtle"; }

}
