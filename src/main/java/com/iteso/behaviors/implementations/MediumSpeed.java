package com.iteso.behaviors.implementations;
import com.iteso.behaviors.iAccelerate;

/**
 * Medium speed.
 */
public class MediumSpeed implements iAccelerate {

    public String getAccelerate() {
        return "Medium";
    }

    @Override
    public String accelerate() {
        return "I'm going at medium speed!!!";
    }

    @Override
    public String decelerate(){
        return "I'm slowing down!!";
    }

}
