package com.iteso.behaviors.implementations;
import com.iteso.behaviors.iAccelerate;

/**
 * Normal speed.
 */
public class NormalSpeed implements iAccelerate {

     public String getAccelerate() {
        return "Normal";
    }

    public String accelerate() {
        return "I'm going at normal speed!!!";
    }

    public String decelerate(){
        return "I'm slowing down!!";
    }

}
