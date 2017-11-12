package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iAccelerate;
/**
 *
 */
public class VerySlow implements iAccelerate {
    /**
     *@return ok
     */
    public final String accelerate() {
        return "This nougat is fast 50%";
    }
    /**
     *@return ok
     */
    public final String slowdown() {
        return "This nougat can brake 50%";
    }
    /**
     *@return ok
     */
    public final boolean canDrift() {
        return false;
    }
}
