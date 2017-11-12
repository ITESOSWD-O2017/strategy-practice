package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.Iaccelerate;
/**
 *
 */
public class NotSoFast implements Iaccelerate {
    /**
     *@return ok
     */
    public final String accelerate() {
        return "This nougat is fast 80%";
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
        return true;
    }
}
