package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IPower;
/**
 * Flower power.
 */
public class FlowerPower extends IPower {
    @Override
    public final String getPower() {
        return "Flower";
    }
    @Override
    public final String catchPower() {
        return "I Cached a flower!!!";
    }
    @Override
    public final String preparePower() {
        return "I'm preparing a flower!!";
    }
    @Override
    public final String usePower() {
        return "I'm shooting fireballs!!!!";
    }
}
