package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.BananaPower;
import com.iteso.behaviors.implementations.FlowerPower;
import com.iteso.behaviors.implementations.NormalPower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class YoshiTest {
    Yoshi yoshi;
    IPower bPower = new BananaPower();
    IPower nullPower;
    @Before
    public void setUp() throws Exception {
        yoshi = new Yoshi();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Fast",yoshi.getAccelerate());
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Yoshi",yoshi.getName());
    }

    @Test
    public void performXButtonAction() throws Exception {
        yoshi.setPower(bPower);
        assertEquals("I'll make them slide!!!!",yoshi.performXButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
        assertEquals("I'm slowing down!!",yoshi.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("jump",yoshi.performAButtonAction());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("I'm going faaaast!!!",yoshi.performBButtonAction());
    }

    @Test
    public void setPower() throws Exception {
        assertEquals("Please assign a power",yoshi.setPower(null));
    }

}