package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iPower;

public class RedTurtle implements iPower {

    public String getPower() {
        return "My power is amazing";
    }

    public String usePower() {
        return "I will hit the enemy";
    }

    public String losePower() {
        return "Be careful, you are unprotected";
    }
}