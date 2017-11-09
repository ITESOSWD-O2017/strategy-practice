package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iAccelerate;

public class RedMushroom implements iAccelerate {

    public String accelerate() {
        return "Go go go";
    }

    public String decelerate() {
        return "You are losing your superpowers";
    }

    public String skid() {
        return "If you want to go to the left, turn to the right";
    }

    public String stop() {
        return "You stopped";
    }
}
