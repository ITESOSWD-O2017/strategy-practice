package com.iteso.nintendo;

import com.iteso.behaviors.implementations.NormalPower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NormalPowerTest {
    NormalPower normal;
    @Before
    public void setUp() throws Exception {
        normal = new NormalPower();
    }

    @Test
    public void getPower() throws Exception {
        assertEquals("Normal",normal.getPower());
    }

    @Test
    public void catchPower() throws Exception {
        assertEquals("I did'nt catch anything :(",normal.catchPower());
    }

    @Test
    public void preparePower() throws Exception {
        assertEquals("I don´t have power to prepare!",normal.preparePower());
    }

    @Test
    public void usePower() throws Exception {
        assertEquals("I'll do nothing :s",normal.usePower());
    }

}