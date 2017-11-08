package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iPower;

/**
 * Flower power.
 */
public class FlowerPower implements iPower {

    public String getPower(){
        return "Flower";
    }

    public String catchPower() {
        return "I Cached a flower!!!";
    }

    public String preparePower(){
        return "I'm preparing a flower!!";
    }

    public String usePower(){
        return "I'm shooting fireballs!!!!";
    }
}