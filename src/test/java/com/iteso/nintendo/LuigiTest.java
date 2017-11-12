package com.iteso.nintendo;

import com.iteso.nintendo.Nintendo.Luigi;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iPower;
import com.iteso.nintendo.Interfaces.iAccelerate;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class LuigiTest {
    Luigi luigi;

    @Before
    public void setUp(){

        luigi = new Luigi();
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Luigi",luigi.getName());
    }

    @Test
    public void performXButtonAction() throws Exception {
        assertEquals(null,luigi.performXButtonAction());
    }

    @Test
    public void performYButtonAction() throws Exception {
        assertEquals("Im racing!!",luigi.performYButtonAction());
    }

    @Test
    public void performAButtonAction() throws Exception {
        assertEquals("jump",luigi.performAButtonAction());
    }

    @Test
    public void performBButtonAction() throws Exception {
        assertEquals("nothing",luigi.performBButtonAction());
    }

}
