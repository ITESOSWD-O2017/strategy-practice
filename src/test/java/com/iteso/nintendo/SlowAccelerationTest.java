package com.iteso.nintendo;

import com.iteso.behaviors.implementations.SlowAcceleration;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlowAccelerationTest {
    SlowAcceleration slow;
    @Before
    public void setUp() throws Exception {
        slow = new SlowAcceleration();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Slow",slow.acceleration());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("Super slow!",slow.startAccelerating());
    }

    @Test
    public void SlowDown() throws Exception {
        assertEquals("Brake!",slow.slowDown());
    }
}
