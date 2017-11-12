package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.Ipower;
/**
 *
 */
public class Star implements Ipower {
    /**
     *@return ok
     */
    public final String name() {
        return "Star";
    }
    /**
     *@return ok
     */
    public final String icon() {
        return "Star.png";
    }
    /**
     *@return ok
     */
    public final String desc() {
        return "Invulnerabilidad alv";
    }
}
