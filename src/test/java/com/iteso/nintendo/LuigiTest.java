package com.iteso.nintendo;

import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class LuigiTest {
    Luigi luigi;
    IPower power = new NormalMode();

    @Before
    public void setUp(){
        luigi = new Luigi();
    }

    @Test
    public void testPowerWhenLuigiTakesAFlower(){
        luigi.setPower(power);

        assertEquals("fire", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
        luigi.setPower(power);

        assertEquals("fireball", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar(){
        luigi.setPower(power);

        assertEquals("invincibility", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
        luigi.setPower(power);

        assertEquals("dash", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal(){
        luigi.setPower(power);

        assertEquals("normal", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setPower(power);

        assertEquals("nothing", luigi.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        luigi.setPower(power);

        assertEquals("error", luigi.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        luigi.setPower(power);

        assertEquals("error", luigi.performBButtonAction());
    }

}
