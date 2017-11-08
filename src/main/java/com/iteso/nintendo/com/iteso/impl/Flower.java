package com.iteso.nintendo.com.iteso.impl;
import com.iteso.nintendo.iPower;

public class Flower implements iPower {
    public String getPower(){
        return "flower";
    }

    public String preparePower(){
        return "fire hand";
    }

    public String releasePower(){
        return "fire";
    }
}
