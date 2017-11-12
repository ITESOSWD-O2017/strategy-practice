package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.iteso.behaviors.implementations.NormalAcceleration;

public class NormalAccelerationTest {
    NormalAcceleration normal;
    @Before
    public void setUp() throws Exception {
        normal = new NormalAcceleration();
    }

    @Test
    public void getAccelerate() throws Exception {
        assertEquals("Normal",normal.acceleration());
    }

    @Test
    public void accelerate() throws Exception {
        assertEquals("Not fast but secure!",normal.startAccelerating());
    }

    @Test
    public void SlowDown() throws Exception {
        assertEquals("Brake!",normal.slowDown());
    }
}
