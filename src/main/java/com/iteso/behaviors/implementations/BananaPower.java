package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iPower;

/**
 * Banana power.
 */
public class BananaPower implements iPower {

    @Override
    public String getPower(){
        return "Banana";
    }

    @Override
    public String catchPower() {
        return "I Catched a banana!!!";
    }

    @Override
    public String preparePower(){
        return "I'm preparing a banana!!";
    }

    @Override
    public String usePower(){
        return "I'll make them slidee!!!!";
    }
}