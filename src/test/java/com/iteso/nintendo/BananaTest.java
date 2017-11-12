package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Implementations.*;
import static org.junit.Assert.assertEquals;
public class BananaTest {

    powerBanana banana;

    @Before
    public void setUp(){
        banana = new powerBanana();
    }

    @Test
    public void testPower(){
        assertEquals("Im throwing the banana!", banana.usePower());
    }

    @Test
    public void frontPower(){
        assertEquals("Im throwing the banana to the character in front", banana.powerForward());
    }

    @Test
    public void backPower(){
        assertEquals("Im throwing the banana to the character in the back", banana.powerBackwards());
    }

}
