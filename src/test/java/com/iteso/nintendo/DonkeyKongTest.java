package com.iteso.nintendo;
import com.iteso.nintendo.Nintendo.DonkeyKong;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;

import static org.junit.Assert.assertEquals;

public class DonkeyKongTest {

    DonkeyKong donkeyKong;

    @Before
    public void setUp(){
        donkeyKong = new DonkeyKong();
    }


    @Test
    public void getName() throws Exception {
        assertEquals("Donkey Kong",donkeyKong.getName());
    }

    @Test
    public void performXButtonAction() throws Exception {
        assertEquals("Lets go",donkeyKong.performXButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
        assertEquals("Im running fast",donkeyKong.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("Im slowing down",donkeyKong.performAButtonAction());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("Ja ja loser!",donkeyKong.performBButtonAction());
    }
}

