package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.iteso.behaviors.implementations.Banana;

public class BananaTest {
    Banana banana;

    @Before
    public void setUp(){
        banana = new Banana();
    }

    @Test
    public void testPower(){
        assertEquals("Banana", banana.catchPower());
    }

    @Test
    public void testPreparation(){
        assertEquals("Fear the banana!!", banana.retainPower());
    }

    @Test
    public void testUse(){
        assertEquals("Banana!!", banana.throwForward());
    }

    @Test
    public void testCatch(){
        assertEquals("I have a banana!!!", banana.catchPower());
    }
}