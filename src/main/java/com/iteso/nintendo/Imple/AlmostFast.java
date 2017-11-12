package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.Iaccelerate;

/**
 *
 */
public class AlmostFast implements Iaccelerate {
    /**
     *@return ok
     */
    public final String accelerate() {
        return "This nougat is fast 90%";
    }
    /**
     *@return ok
     */
    public final String slowdown() {
        return "This nougat can brake 100%";
    }
    /**
     *@return ok
     */
    public final boolean canDrift() {
        return false;
    }
}
