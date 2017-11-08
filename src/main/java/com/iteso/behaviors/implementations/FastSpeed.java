package com.iteso.behaviors.implementations;
import com.iteso.behaviors.iAccelerate;

/**
 * Fast speed.
 */
public class FastSpeed implements iAccelerate {

    public String getAccelerate() {
        return "Fast";
    }

    public String accelerate() {
        return "I'm going faaaast!!!";
    }
    public String decelerate(){
        return "I'm slowing down!!";
    }

}
