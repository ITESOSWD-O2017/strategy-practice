package com.iteso.nintendo.Implementations;
import com.iteso.nintendo.Interfaces.iAccelerate;

public class AccelerateMin implements iAccelerate{

    public String startPush(){

        return "Im starting to accelerate!";
    }
    public String acelerate(){

        return "Im running!";
    }
    public String desacelerate(){
        return "I'm desacelerating !";
    }
}
