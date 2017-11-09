package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IPower;

/**
 * Normal power.
 */
public class NormalPower extends IPower {
    @Override
    public final String getPower() {
        return "Normal";
    }
    @Override
    public final String catchPower() {
        return "I did'nt catch anything :(";
    }
    @Override
    public final String preparePower() {
        return "I don´t have power to prepare!";
    }
    @Override
    public final String usePower() {
        return "I'll do nothing :s";
    }
}
