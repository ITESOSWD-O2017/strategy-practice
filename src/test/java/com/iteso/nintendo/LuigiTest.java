package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import com.iteso.nintendo.com.iteso.impl.*;

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
    public void testPowerWhenLuigiTakesAFlower(){
        luigi.setPower(new Flower());

        assertEquals("fire", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
        luigi.setPower(new Flower());

        assertEquals("fireball", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar(){
        luigi.setPower(new Star());

        assertEquals("invincibility", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
        luigi.setPower(new Star());

        assertEquals("dash", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal(){
        luigi.setPower(new Clear());

        assertEquals("normal", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setPower(new Clear());

        assertEquals("nothing", luigi.performBButtonAction());
    }
    @Test
    public void testperformXbuttonAction() {
        luigi.setAccelerationType(false);
        luigi.setSpeed("not that fast");
        assertEquals("I´m decelerating now I am normal",luigi.performXButtonAction());

    }
    @Test
    public void testperformYbuttonAction() {
        luigi.setAccelerationType(false);
        luigi.setSpeed("not that fast");
        assertEquals("I´m accelerating now I am fast",luigi.performYButtonAction());

    }
}
