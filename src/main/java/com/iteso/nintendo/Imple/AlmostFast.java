package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iAccelerate;

public class AlmostFast implements iAccelerate {
    public String accelerate() {
        return "This nougat is fast 90%";
    }

    public String slowdown() {
        return "This nougat can brake 100%";
    }

    public boolean canDrift() {
        return false;
    }
}
