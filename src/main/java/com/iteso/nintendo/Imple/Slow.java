package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.Iaccelerate;
/**
 *
 */
public class Slow implements Iaccelerate {
    /**
     *@return ok
     */
    public final String accelerate() {
        return "This nougat is fast 60%";
    }
    /**
     *@return ok
     */
    public final String slowdown() {
        return "This nougat can brake 80%";
    }
    /**
     *@return ok
     */
    public final boolean canDrift() {
        return true;
    }
}
