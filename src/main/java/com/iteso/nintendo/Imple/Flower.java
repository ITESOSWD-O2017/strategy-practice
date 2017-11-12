package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.Ipower;
/**
 *
 */
public class Flower implements Ipower {
    /**
     *@return ok
     */
    public final String name() {
        return "Flower";
    }
    /**
     *@return ok
     */
    public final String icon() {
        return "Flower.png";
    }
    /**
     *@return ok
     */
    public final String desc() {
        return "Lanzar bolas de fuego alv";
    }
}
