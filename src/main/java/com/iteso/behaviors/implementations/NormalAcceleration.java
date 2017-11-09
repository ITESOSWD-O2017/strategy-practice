package com.iteso.behaviors.implementations;
import com.iteso.behaviors.iAccelerate;


public class NormalAcceleration implements iAccelerate {

    public String startAccelerating() {
        return "Normal";
    }

    public String Acceleration() {
        return "We got this! Normal and secure acceleration!";
    }

    public String slowDown() {
        return "Slowing down!";
    }
}
