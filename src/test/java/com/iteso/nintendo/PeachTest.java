package com.iteso.nintendo;

import com.iteso.nintendo.com.iteso.impl.Clear;
import com.iteso.nintendo.com.iteso.impl.Flower;
import com.iteso.nintendo.com.iteso.impl.Star;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeachTest {
    Peach peach;

    @Before
    public void setUp(){
        peach = new Peach();
    }

    @Test
    public void testPowerWhenPeachTakesAFlower(){
        peach.setPower(new Flower());

        assertEquals("fire",peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenPeachTakesAFlower(){
        peach.setPower(new Flower());

        assertEquals("fireball",peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenPeachTakesAStar(){
        peach.setPower(new Star());

        assertEquals("invincibility",peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenPeachTakesAStar(){
        peach.setPower(new Star());

        assertEquals("dash",peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenPeachIsNormal(){
        peach.setPower(new Clear());

        assertEquals("normal",peach.getCurrentPower());
    }

    @Test
    public void testBActionWhenPeachIsNormal(){
        peach.setPower(new Clear());

        assertEquals("nothing",peach.performBButtonAction());
    }
    @Test
    public void testperformXbuttonAction() {
        peach.setAccelerationType(false);
        peach.setSpeed("not that fast");
        assertEquals("I´m decelerating now I am normal",peach.performXButtonAction());

    }
    @Test
    public void testperformYbuttonAction() {
        peach.setAccelerationType(false);
        peach.setSpeed("not that fast");
        assertEquals("I´m accelerating now I am fast",peach.performYButtonAction());

    }
}
