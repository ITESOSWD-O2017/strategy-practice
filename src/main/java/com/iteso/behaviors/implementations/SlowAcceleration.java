package com.iteso.behaviors.implementations;
import com.iteso.behaviors.iAccelerate;


public class SlowAcceleration implements iAccelerate {

    public String startAccelerating() {
        return "Here I go!";
    }

    public String Acceleration() {
        return "Slow acceleration!";
    }

    public String slowDown() {
        return "Slowing down!";
    }
}
