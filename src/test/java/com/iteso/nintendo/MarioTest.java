package com.iteso.nintendo;

import com.iteso.nintendo.Mario;
import com.iteso.nintendo.com.iteso.impl.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Miguel on 10/11/17.
 */
public class MarioTest {
    Mario mario;

    @Before
    public void setUp(){
        mario = new Mario();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower() {
        mario.setPower(new Flower());

        assertEquals("fire", mario.getCurrentPower());

    }

    @Test
    public void testBActionWhenMarioTakesAFlower() {
        mario.setPower(new Flower());

        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar() {
        mario.setPower(new Star());

        assertEquals("invincibility",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar() {
        mario.setPower(new Star());

        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal() {
        mario.setPower(new Clear());

        assertEquals("normal",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal() {
        mario.setPower(new Clear());

        assertEquals("nothing",mario.performBButtonAction());
    }
    @Test
    public void testperformXbuttonAction() {
        mario.setAccelerationType(false);
        mario.setSpeed("not that fast");
        assertEquals("I´m decelerating now I am normal",mario.performXButtonAction());

    }
    @Test
    public void testperformYbuttonAction() {
        mario.setAccelerationType(false);
        mario.setSpeed("not that fast");
        assertEquals("I´m accelerating now I am fast",mario.performYButtonAction());

    }
}
