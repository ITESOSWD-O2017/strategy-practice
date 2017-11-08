package com.iteso.nintendo.com.iteso.impl;

import com.iteso.nintendo.iPower;

public class Star implements iPower {
    public String getPower(){
        return "star";
    }

    public String preparePower(){
        return "Light character";
    }

    public String releasePower(){
        return "Invincibility";
    }
}
