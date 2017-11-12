package com.iteso.nintendo;

import com.iteso.nintendo.com.iteso.impl.Clear;
import com.iteso.nintendo.com.iteso.impl.Flower;
import com.iteso.nintendo.com.iteso.impl.Star;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToadTest {
    Toad toad;

    @Before
    public void setUp(){
        toad = new Toad();
    }

    @Test
    public void testPowerWhenToadTakesAFlower(){
        toad.setPower(new Flower());

        assertEquals("fire",toad.getCurrentPower());
    }

    @Test
    public void testBActionWhenToadTakesAFlower(){
        toad.setPower(new Flower());

        assertEquals("fireball",toad.performBButtonAction());
    }

    @Test
    public void testPowerWhenToadTakesAStar(){
        toad.setPower(new Star());

        assertEquals("invincibility",toad.getCurrentPower());
    }

    @Test
    public void testBActionWhenToadTakesAStar(){
        toad.setPower(new Star());

        assertEquals("dash",toad.performBButtonAction());
    }

    @Test
    public void testPowerWhenToadIsNormal(){
        toad.setPower(new Clear());

        assertEquals("normal",toad.getCurrentPower());
    }

    @Test
    public void testBActionWhenToadIsNormal(){
        toad.setPower(new Clear());

        assertEquals("nothing",toad.performBButtonAction());
    }
    @Test
    public void testperformXbuttonAction() {
        toad.setAccelerationType(false);
        toad.setSpeed("not that fast");
        assertEquals("I´m decelerating now I am normal",toad.performXButtonAction());

    }
    @Test
    public void testperformYbuttonAction() {
        toad.setAccelerationType(false);
        toad.setSpeed("not that fast");
        assertEquals("I´m accelerating now I am fast",toad.performYButtonAction());

    }
}
