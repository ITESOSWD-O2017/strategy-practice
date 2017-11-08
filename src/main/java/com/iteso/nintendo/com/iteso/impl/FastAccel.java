package com.iteso.nintendo.com.iteso.impl;

import com.iteso.nintendo.iAccelerate;

public class FastAccel implements iAccelerate {
    public String accel(String speed){
        if (speed.toLowerCase()=="normal"){
            return "fast";
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
            return "normal";
        }
        else
            return speed;
    }
}
