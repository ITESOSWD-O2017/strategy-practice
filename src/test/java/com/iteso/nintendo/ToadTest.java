package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.BananaPower;
import com.iteso.behaviors.implementations.FlowerPower;
import com.iteso.behaviors.implementations.NormalPower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToadTest {
    Toad toad;
    IPower bPower = new BananaPower();
    IPower nullPower;
    @Before
    public void setUp() throws Exception {
        toad = new Toad();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Slow",toad.getAccelerate());
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Toad",toad.getName());
    }

    @Test
    public void performXButtonAction() throws Exception {
        toad.setPower(bPower);
        assertEquals("I'll make them slide!!!!",toad.performXButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
        assertEquals("I'm slowing down, so i'm even slower!!",toad.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("jump",toad.performAButtonAction());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("I'm going so slow!!!",toad.performBButtonAction());
    }

    @Test
    public void setPower() throws Exception {
        assertEquals("Please assign a power",toad.setPower(nullPower));
    }

}