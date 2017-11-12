package com.iteso.nintendo;

import com.iteso.nintendo.Implementations.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccMinTest {

    AccelerateMin min;

    @Before
    public void setUp() throws Exception {
        min = new AccelerateMin();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Im starting to accelerate!",min.startPush());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("Im running!",min.acelerate());
    }

    @Test
    public void SlowDown() throws Exception {
        assertEquals("I'm desacelerating !",min.desacelerate());
    }
}
