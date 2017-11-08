package com.iteso.nintendo.com.iteso.impl;

import com.iteso.nintendo.iAccelerate;

public class NormalAccel implements iAccelerate {
    public String accel(String speed){
        if (speed.toLowerCase()=="normal"){
            return "not that fast";
        }
        else if (speed.toLowerCase()=="not that fast"){
            return "fast";
        }
        else if (speed.toLowerCase()=="fast"){
            return "fast";
        }
        else
            return speed;
    }
    public String decel(String speed){
        if (speed.toLowerCase()=="normal"){
            return "normal";
        }
        else if (speed.toLowerCase()=="not that fast"){
            return "normal";
        }
        else if (speed.toLowerCase()=="fast") {
            return "not that fast";
        }
        else
            return speed;
    }
}
