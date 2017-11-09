package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IAccelerate;

/**
 * Normal speed.
 */
public class NormalSpeed extends IAccelerate {
    @Override
    public final String getAccelerate() {
        return "Normal";
    }
    @Override
    public final String accelerate() {
        return "I'm going at normal speed!!!";
    }
    @Override
    public final String decelerate() {
        return "I'm slowing down!!";
    }
}
