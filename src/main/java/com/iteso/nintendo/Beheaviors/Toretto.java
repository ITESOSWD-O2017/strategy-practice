package com.iteso.nintendo.Beheaviors;

import com.iteso.nintendo.Interfaces.iAccelerate;

public class Toretto implements iAccelerate{

    public String accelerate(){
        return "You're going too damn fast, u can die dude";
    }
    public String desaccelerate(){
        return "You're desaccelerating";
    }
    public boolean curves(){
        return true;
    }
    public boolean turbo(){
        return true;
    }
}
