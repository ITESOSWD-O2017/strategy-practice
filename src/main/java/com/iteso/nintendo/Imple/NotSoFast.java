package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iAccelerate;

public class NotSoFast implements iAccelerate {
    public String accelerate() {
        return "This nougat is fast 80%";
    }

    public String slowdown() {
        return "This nougat can brake 100%";
    }

    public boolean canDrift() {
        return true;
    }
}
