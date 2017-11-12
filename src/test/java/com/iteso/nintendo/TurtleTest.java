package com.iteso.nintendo;

import com.iteso.nintendo.Implementations.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TurtleTest {

    powerTurtle turtle;

    @Before
    public void setUp(){
        turtle = new powerTurtle();
    }

    @Test
    public void testPower(){
        assertEquals("Im throwing the turtle!", turtle.usePower());
    }

    @Test
    public void frontPower(){
        assertEquals("Im throwing the turtle to the character in front", turtle.powerForward());
    }

    @Test
    public void backPower(){
        assertEquals("Im throwing the turtle to the character in the back", turtle.powerBackwards());
    }
}
