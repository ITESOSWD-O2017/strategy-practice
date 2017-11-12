package com.iteso.nintendo;
import com.iteso.nintendo.Nintendo.Yoshi;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;

import static org.junit.Assert.assertEquals;

public class YoshiTest {
    Yoshi yoshi;

    @Before
    public void setUp(){

        yoshi = new Yoshi();
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Yoshi",yoshi.getName());
    }

    @Test
    public void performXButtonAction() throws Exception {
        assertEquals("Lets do this thing",yoshi.performXButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
        assertEquals("Im running faster",yoshi.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("Im slowing my speed",yoshi.performAButtonAction());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("nothing",yoshi.performBButtonAction());
    }
}

