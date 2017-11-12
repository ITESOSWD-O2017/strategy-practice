package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IPower;

/**
 * Created by AlejandraSahagun on 08/11/16.
 */
public class Flower implements IPower {

    /** @return String. */
    public final String getPower() {
        return "I will burn everyone";
    }

    /** @return String. */
    public final String usePower() {
        return "Fire!!!";
    }

    /** @return String. */
    public final String losePower() {
        return "You are normal, again";
    }

    /** @return String. */
    public final String getPowerDescription() {
        return "Flower";
    }

}
