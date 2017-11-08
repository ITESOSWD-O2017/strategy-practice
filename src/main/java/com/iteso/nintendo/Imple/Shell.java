package com.iteso.nintendo.Imple;

import com.iteso.nintendo.Interfaz.iPower;

public class Shell implements iPower {

    public String name() {
        return "Shell";
    }

    public String icon() {
        return "Shell.png";
    }

    public String desc() {
        return "Lanzar conchas";
    }
}
