package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IAccelerate;
/**
 * Fast speed.
 */
public class FastSpeed extends IAccelerate {

    @Override
    public final String getAccelerate() {
        return "Fast";
    }
    @Override
    public final String accelerate() {
        return "I'm going faaaast!!!";
    }
    @Override
    public final    String decelerate() {
        return "I'm slowing down!!";
    }
}
