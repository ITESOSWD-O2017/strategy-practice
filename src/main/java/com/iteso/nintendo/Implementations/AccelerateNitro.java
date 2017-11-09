package com.iteso.nintendo.Implementations;
import com.iteso.nintendo.Interfaces.iAccelerate;

public class AccelerateNitro implements iAccelerate{

    public String startPush(){

        return "Im starting to accelerate with nitro!";
    }
    public String acelerate(){
        return "Im using nitro while running!";
    }
    public String desacelerate(){

        return "I'm desacelerating !";
    }
}

