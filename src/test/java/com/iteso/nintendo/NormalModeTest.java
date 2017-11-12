package com.iteso.nintendo;

import com.iteso.behaviors.implementations.NormalMode;
import com.iteso.behaviors.implementations.Shell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalModeTest {
    NormalMode normal;

    @Before
    public void setUp(){
        normal = new NormalMode();
    }

    @Test
    public void testPower(){
        assertEquals("Normal", normal.catchPower());
    }

    @Test
    public void testPreparation(){
        assertEquals("No power!", normal.retainPower());
    }

    @Test
    public void testUse(){
        assertEquals("No power!", normal.throwForward());
    }

    @Test
    public void testCatch(){
        assertEquals("No power!", normal.catchPower());
    }
}
