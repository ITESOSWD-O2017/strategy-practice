package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iAccelerate;

public class VerySlow implements iAccelerate {
    public String accelerate() {
        return "This nougat is fast 50%";
    }

    public String slowdown() {
        return "This nougat can brake 50%";
    }

    public boolean canDrift() {
        return false;
    }
}
