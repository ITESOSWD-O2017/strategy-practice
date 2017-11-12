package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.Iaccelerate;
/**
 *
 */
public class SlowAF implements Iaccelerate {
    /**
     *@return ok
     */
    public final String accelerate() {
        return "This nougat is fast 30%";
    }
    /**
     *@return ok
     */
    public final String slowdown() {
        return "This nougat can brake 2%";
    }
    /**
     *@return ok
     */
    public final boolean canDrift() {
        return true;
    }
}
