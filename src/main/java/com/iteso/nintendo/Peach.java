package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.implementations.SlowSpeed;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Peach extends NintendoCharacter {
    /**
     * Normal speed param.
     */
    private IAccelerate acceleration = new SlowSpeed();
    /**
     * Constructor.
     */
    public Peach() {
        setAccelerate(this.acceleration);
        setName("Peach");
    }
}

