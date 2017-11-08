package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iPower;

public class Star implements iPower {

    public String name() {
        return "Star";
    }

    public String icon() {
        return "Star.png";
    }

    public String desc() {
        return "Invulnerabilidad alv";
    }
}
