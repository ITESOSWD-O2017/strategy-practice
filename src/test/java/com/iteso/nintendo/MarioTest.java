package com.iteso.nintendo;

import com.iteso.nintendo.Nintendo.Mario;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class MarioTest {
    Mario mario;

    @Before
    public void setUp(){

        mario = new Mario();
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Mario",mario.getName());
    }

    @Test
    public void performXButtonAction() throws Exception {
        assertEquals("Im in the race mates!",mario.performXButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
        assertEquals("Lets do it",mario.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("slide",mario.performAButtonAction());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("nothing",mario.performBButtonAction());
    }
}
