package com.iteso.nintendo;

import com.iteso.nintendo.Implementations.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StarTest {

    powerStar star;

    @Before
    public void setUp(){
        star = new powerStar();
    }

    @Test
    public void testPower(){
        assertEquals("Im using the power", star.usePower());
    }

    @Test
    public void frontPower(){
        assertEquals("Can't throw this power forwards", star.powerForward());
    }

    @Test
    public void backPower(){
        assertEquals("Can't throw this power backwards", star.powerBackwards());
    }

}
