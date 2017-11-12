package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import com.iteso.nintendo.Implementations.*;
import com.iteso.nintendo.Interfaces.iAccelerate;
import static org.junit.Assert.assertEquals;

public class AccMaxTest {

    AccelerateMax max;

    @Before
    public void setUp() throws Exception {
        max = new AccelerateMax();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Im starting to accelerate faster!",max.startPush());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("Im running with my max capacity!",max.acelerate());
    }

    @Test
    public void SlowDown() throws Exception {
        assertEquals("I'm desacelerating !",max.desacelerate());
    }
}
