package com.iteso.behaviors.implementations;

import com.iteso.behaviors.iPower;

public class Star implements iPower {

    public String getPower() {
        return "I'm amazing and invincible!";
    }

    public String usePower() {
        return "Get out of the way";
    }

    public String losePower() {
        return "They come after us D:";
    }
}
