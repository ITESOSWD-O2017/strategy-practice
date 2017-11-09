package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.implementations.FastSpeed;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Yoshi extends NintendoCharacter {
    /**
     * Fast speed param.
     */
    private IAccelerate acceleration = new FastSpeed();
    /**
     * Constructor.
     */
    public Yoshi() {
        setAccelerate(this.acceleration);
        setName("Yoshi");
    }
}

