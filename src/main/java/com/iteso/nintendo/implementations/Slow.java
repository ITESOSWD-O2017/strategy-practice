package com.iteso.nintendo.implementations;

import com.iteso.nintendo.behavior.iAccelerate;

public class Slow implements iAccelerate {
    public String startAccelerate() {

        return "Accelerating at 30%";
    }
}
