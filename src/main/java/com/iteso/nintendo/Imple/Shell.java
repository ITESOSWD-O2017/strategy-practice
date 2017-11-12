package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.Ipower;
/**
 *
 */
public class Shell implements Ipower {
    /**
     *@return ok
     */
    public final String name() {
        return "Shell";
    }
    /**
     *@return ok
     */
    public final String icon() {
        return "Shell.png";
    }
    /**
     *@return ok
     */
    public final String desc() {
        return "Lanzar conchas";
    }
}
