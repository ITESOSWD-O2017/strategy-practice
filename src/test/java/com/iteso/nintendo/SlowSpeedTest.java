package com.iteso.nintendo;

import com.iteso.behaviors.implementations.SlowSpeed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SlowSpeedTest {
    SlowSpeed slow;
    @Before
    public void setUp() throws Exception {
        slow = new SlowSpeed();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Slow", slow.getAccelerate());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("I'm going so slow!!!", slow.accelerate());
    }

    @Test
    public void decelerate() throws Exception {
        assertEquals("I'm slowing down!!", slow.decelerate());
    }

}