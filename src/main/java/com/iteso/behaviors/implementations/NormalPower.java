package com.iteso.behaviors.implementations;
import com.iteso.behaviors.iPower;

/**
 * Normal power.
 */
public class NormalPower implements iPower {

    public String getPower(){
        return "Normal";
    }

    public String catchPower() {
        return "I did'nt catch anything :(";
    }

    public String preparePower(){
        return "I don´t have power to prepare!";
    }

    public String usePower(){
        return "I'll do nothing :s";
    }
}