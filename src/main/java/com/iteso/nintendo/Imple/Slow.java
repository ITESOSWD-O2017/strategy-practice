package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iAccelerate;

public class Slow implements iAccelerate {
    public String accelerate() {
        return "This nougat is fast 60%";
    }

    public String slowdown() {
        return "This nougat can brake 80%";
    }

    public boolean canDrift() {
        return true;
    }
}
