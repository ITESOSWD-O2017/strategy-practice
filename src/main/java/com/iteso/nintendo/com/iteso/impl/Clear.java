package com.iteso.nintendo.com.iteso.impl;

import com.iteso.nintendo.iPower;

public class Clear implements iPower {
    public String getPower(){
        return "clear power";
    }

    public String preparePower(){
        return "Vanish all";
    }

    public String releasePower(){
        return "normal";
    }
}
