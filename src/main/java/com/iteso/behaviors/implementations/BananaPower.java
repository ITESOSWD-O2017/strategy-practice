package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IPower;
/**
 * Banana power.
 */
public class BananaPower extends IPower {

    @Override
    public final String getPower() {
        return "Banana";
    }
    @Override
    public final String catchPower() {
        return "I Cached a banana!!!";
    }

    @Override
    public final String preparePower() {
        return "I'm preparing a banana!!";
    }

    @Override
    public final String usePower() {
        return "I'll make them slide!!!!";
    }
}
