package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iPower;

public class Flower implements iPower {

    public String getPower() {
        return "I will burn everyone";
    }

    public String usePower() {
        return "Fire!!!";
    }

    public String losePower() {
        return "You are normal, again";
    }
}
