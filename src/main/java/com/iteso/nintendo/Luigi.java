package com.iteso.nintendo;
import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.implementations.NormalSpeed;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter {
    /**
     * Normal speed param.
     */
    private IAccelerate acceleration = new NormalSpeed();
    /**
     * Constructor.
     */
    public Luigi() {
        setAccelerate(this.acceleration);
        setName("Luigi");
    }
}
