package com.iteso.nintendo;

import com.iteso.behaviors.implementations.BananaPower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BananaPowerTest {
    BananaPower banana;
    @Before
    public void setUp(){
        banana = new BananaPower();
    }

    @Test
    public void testPower(){
        assertEquals("Banana", banana.getPower());
    }

    @Test
    public void testPreparation(){
        assertEquals("I'm preparing a banana!!", banana.preparePower());
    }

    @Test
    public void testUse(){
        assertEquals("I'll make them slide!!!!", banana.usePower());
    }

    @Test
    public void testCatch(){
        assertEquals("I Cached a banana!!!", banana.catchPower());
    }

}