package com.iteso.behaviors.implementations;
import com.iteso.behaviors.IAccelerate;
/**
 * Slow speed.
 */
public class SlowSpeed extends IAccelerate {
    @Override
    public final String getAccelerate() {
        return "Slow";
    }
    @Override
    public final String accelerate() {
        return "I'm going so slow!!!";
    }
    @Override
    public final String decelerate() {
        return "I'm slowing down, so i'm even slower!!";
    }

}

