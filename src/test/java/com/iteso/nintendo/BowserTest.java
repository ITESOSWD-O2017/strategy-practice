package com.iteso.nintendo;
import com.iteso.nintendo.Nintendo.Bowser;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;

import static org.junit.Assert.assertEquals;

public class BowserTest {


    Bowser bowser;

    @Before
    public void setUp(){
        bowser = new Bowser();
    }


    @Test
    public void getName() throws Exception {
        assertEquals("Bowser",bowser.getName());
    }

    @Test
    public void performXButtonAction() throws Exception {
        assertEquals("Im going to win",bowser.performXButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
        assertEquals("Im super fast",bowser.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("Nobody can compare to me",bowser.performAButtonAction());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("nothing",bowser.performBButtonAction());
    }
}

