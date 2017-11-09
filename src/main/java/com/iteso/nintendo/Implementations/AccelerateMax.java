package com.iteso.nintendo.Implementations;
import com.iteso.nintendo.Interfaces.iAccelerate;


public class AccelerateMax implements iAccelerate {

    public String startPush(){

        return "Im starting to accelerate faster!";
    }
    public String acelerate(){

        return "Im running with my max capacity!";
    }
    public String desacelerate(){

        return "I'm desacelerating !";
    }
}

