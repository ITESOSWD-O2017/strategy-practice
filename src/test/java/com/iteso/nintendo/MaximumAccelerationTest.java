package com.iteso.nintendo;

import com.iteso.behaviors.implementations.MaximumAcceleration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumAccelerationTest {
    MaximumAcceleration maximum;
    @Before
    public void setUp() throws Exception {
        maximum = new MaximumAcceleration();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Fast!",maximum.acceleration());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("Fast & furious mode!",maximum.startAccelerating());
    }

    @Test
    public void SlowDown() throws Exception {
        assertEquals("Brake now!!",maximum.slowDown());
    }
}
