package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iAccelerate;

public class BillBala implements iAccelerate {

    public String accelerate() {
        return "Your speed increased by 200 percent, you are the most speed";
    }

    public String decelerate() {
        return "Oh no! your speed is going down";
    }

    public String skid() {
        return "Your laps are the best";
    }

    public String stop() {
        return "You have stopped";
    }
}
