package com.iteso.nintendo;

import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.NormalMode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiddyKongTest {
    DiddyKong diddy;
    IPower power = new NormalMode();

    @Before
    public void setUp(){
        diddy = new DiddyKong();
    }

    @Test
    public void testPowerWhenDiddyKongTakesAFlower(){
        diddy.setPower(power);

        assertEquals("fire",diddy.getCurrentPower());
    }

    @Test
    public void testBActionWhenDiddyKongTakesAFlower(){
        diddy.setPower(power);

        assertEquals("fireball",diddy.performBButtonAction());
    }

    @Test
    public void testPowerWhenDiddyKongTakesAStar(){
        diddy.setPower(power);

        assertEquals("invincibility",diddy.getCurrentPower());
    }

    @Test
    public void testBActionWhenDiddyKongTakesAStar(){
        diddy.setPower(power);

        assertEquals("dash",diddy.performBButtonAction());
    }

    @Test
    public void testPowerWhenDiddyKongIsNormal(){
        diddy.setPower(power);

        assertEquals("normal",diddy.getCurrentPower());
    }

    @Test
    public void testBActionWhenDiddyKongIsNormal(){
        diddy.setPower(power);

        assertEquals("nothing",diddy.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        diddy.setPower(power);

        assertEquals("error",diddy.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        diddy.setPower(power);

        assertEquals("error",diddy.performBButtonAction());
    }
}
