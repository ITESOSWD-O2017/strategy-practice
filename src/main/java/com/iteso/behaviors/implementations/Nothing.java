package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IPower;

/**
 * Created by AlejandraSahagun on 11/11/16.
 */
public class Nothing implements IPower {

    /** @return String. */
    public final String getPower() {
        return "I haven't any power";
    }

    /** @return String. */
    public final String usePower() {
        return "-.-!";
    }

    /** @return String. */
    public final String losePower() {
        return "o.o";
    }

    /** @return String. */
    public final String getPowerDescription() {
        return "Nothing";
    }

}
