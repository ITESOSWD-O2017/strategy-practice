package com.iteso.nintendo;

import com.iteso.nintendo.com.iteso.impl.Clear;
import com.iteso.nintendo.com.iteso.impl.Flower;
import com.iteso.nintendo.com.iteso.impl.Star;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowserTest {
    Bowser bowser;

    @Before
    public void setUp(){
        bowser = new Bowser();
    }

    @Test
    public void testPowerWhenBowserTakesAFlower(){
        bowser.setPower(new Flower());

        assertEquals("fire",bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserTakesAFlower(){
        bowser.setPower(new Flower());

        assertEquals("fireball",bowser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBowserTakesAStar(){
        bowser.setPower(new Star());

        assertEquals("invincibility",bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserTakesAStar(){
        bowser.setPower(new Star());

        assertEquals("dash",bowser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBowserIsNormal(){
        bowser.setPower(new Clear());

        assertEquals("normal",bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserIsNormal(){
        bowser.setPower(new Clear());

        assertEquals("nothing",bowser.performBButtonAction());
    }
    @Test
    public void testperformXbuttonAction() {
        bowser.setAccelerationType(false);
        bowser.setSpeed("not that fast");
        assertEquals("I´m decelerating now I am normal",bowser.performXButtonAction());

    }
    @Test
    public void testperformYbuttonAction() {
        bowser.setAccelerationType(false);
        bowser.setSpeed("not that fast");
        assertEquals("I´m accelerating now I am fast",bowser.performYButtonAction());

    }
}
