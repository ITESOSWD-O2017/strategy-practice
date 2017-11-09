package com.iteso.nintendo;

import com.iteso.behaviors.implementations.FlowerPower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlowerPowerTest {

    FlowerPower flower;
    @Before
    public void setUp() throws Exception {
        flower = new FlowerPower();
    }

    @Test
    public void getPower() throws Exception {
        assertEquals("Flower", flower.getPower());
    }

    @Test
    public void catchPower() throws Exception {
        assertEquals("I Cached a flower!!!", flower.catchPower());
    }

    @Test
    public void preparePower() throws Exception {
        assertEquals("I'm preparing a flower!!", flower.preparePower());
    }

    @Test
    public void usePower() throws Exception {
        assertEquals("I'm shooting fireballs!!!!",flower.usePower());
    }

}