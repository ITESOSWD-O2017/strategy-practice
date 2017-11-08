package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iPower;

public class Flower implements iPower {

    public String name() {
        return "Flower";
    }

    public String icon() {
        return "Flower.png";
    }

    public String desc() {
        return "Lanzar bolas de fuego alv";
    }
}
