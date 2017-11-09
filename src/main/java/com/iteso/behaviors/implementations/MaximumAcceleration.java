package com.iteso.behaviors.implementations;
import com.iteso.behaviors.iAccelerate;

public abstract class MaximumAcceleration implements iAccelerate {

    public String startAccelerating() {
        return "Fast acceleration!";
    }

    public String Acceleration() {
        return "To much powerrr!";
    }

    public String slowDown() {
        return "Slowing down!";
    }
}
