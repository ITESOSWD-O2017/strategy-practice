package com.iteso.nintendo;

import com.iteso.nintendo.Implementations.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccNitro {

    AccelerateNitro nitro;

    @Before
    public void setUp() throws Exception {
        nitro = new AccelerateNitro();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Im starting to accelerate with nitro!",nitro.startPush());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("Im using nitro while running!",nitro.acelerate());
    }

    @Test
    public void SlowDown() throws Exception {
        assertEquals("I'm desacelerating !",nitro.desacelerate());
    }
}
