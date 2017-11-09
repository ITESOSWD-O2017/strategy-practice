package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.BananaPower;
import com.iteso.behaviors.implementations.FlowerPower;
import com.iteso.behaviors.implementations.NormalPower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeachTest {
    Peach peach;
    IPower fPower = new FlowerPower();
    IPower nullPower;
    @Before
    public void setUp() throws Exception {
        peach = new Peach();
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Peach",peach.getName());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("I'm going so slow!!!",peach.performBButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
       assertEquals("I'm slowing down, so i'm even slower!!",peach.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("jump",peach.performAButtonAction());
    }

    @Test
    public void performXButtonAction() throws Exception {
        peach.setPower(fPower);
        assertEquals("I'm shooting fireballs!!!!",peach.performXButtonAction());
    }

    @Test
    public void testPowerWhenError(){
        assertEquals("Please assign a power",peach.setPower(null));
    }

}