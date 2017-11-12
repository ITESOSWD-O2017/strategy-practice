package com.iteso.behaviors.implementations;

import com.iteso.behaviors.IPower;

/**
 * Created by AlejandraSahagun on 11/11/16.
 */
public class Error implements IPower {

    /** @return String. */
    public final String getPower() {
        return "Error! You can't have any power";
    }

    /** @return String. */
    public final String usePower() {
        return "Error! You can't use any power";
    }

    /** @return String. */
    public final String losePower() {
        return "Error!";
    }

    /** @return String. */
    public final String getPowerDescription() {
        return "Error";
    }

}
