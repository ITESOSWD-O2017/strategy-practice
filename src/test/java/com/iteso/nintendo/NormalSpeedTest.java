package com.iteso.nintendo;

import com.iteso.behaviors.implementations.NormalSpeed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NormalSpeedTest {
    NormalSpeed normal;
    @Before
    public void setUp() throws Exception {
        normal = new NormalSpeed();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Normal",normal.getAccelerate());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("I'm going at normal speed!!!",normal.accelerate());
    }

    @Test
    public void decelerate() throws Exception {
        assertEquals("I'm slowing down!!",normal.decelerate());
    }

}