package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iAccelerate;

public class GoldenMushroom implements iAccelerate {

    public String accelerate() {
        return "This is going to get out of control!";
    }

    public String decelerate() {
        return "Oh, your power is ending";
    }

    public String skid() {
        return "If you want to go to the left, turn to the right";
    }

    public String stop() {
        return "You don't move anymore";
    }
}
