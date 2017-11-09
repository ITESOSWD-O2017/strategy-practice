package com.iteso.nintendo;

import com.iteso.behaviors.implementations.FastSpeed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FastSpeedTest {
    FastSpeed fast;
    @Before
    public void setUp() throws Exception {
        fast = new FastSpeed();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Fast",fast.getAccelerate());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("I'm going faaaast!!!",fast.accelerate());
    }

    @Test
    public void decelerate() throws Exception {
        assertEquals("I'm slowing down!!",fast.decelerate());
    }
}