package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.iteso.behaviors.implementations.Flower;

public class FlowerTest {
    Flower flower;

    @Before
    public void setUp(){
        flower = new Flower();
    }

    @Test
    public void testPower(){
        assertEquals("Flower", flower.catchPower());
    }

    @Test
    public void testPreparation(){
        assertEquals("Flower power!!", flower.retainPower());
    }

    @Test
    public void testUse(){
        assertEquals("I'll burn you all!!!!", flower.throwForward());
    }

    @Test
    public void testCatch(){
        assertEquals("I have a flower!!!", flower.catchPower());
    }
}