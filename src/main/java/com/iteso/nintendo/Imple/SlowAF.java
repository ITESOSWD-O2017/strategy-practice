package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iAccelerate;

public class SlowAF implements iAccelerate {
    public String accelerate() {
        return "This nougat is fast 30%";
    }

    public String slowdown() {
        return "This nougat can brake 2%";
    }

    public boolean canDrift() {
        return true;
    }
}
