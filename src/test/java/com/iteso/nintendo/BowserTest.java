package com.iteso.nintendo;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.NormalMode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowserTest {
    Bowser bowser;
    IPower power = new NormalMode();

    @Before
    public void setUp(){
        bowser = new Bowser();
    }

    @Test
    public void testPowerWhenBowserTakesAFlower(){
        bowser.setPower(power);

        assertEquals("fire",bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserTakesAFlower(){
        bowser.setPower(power);

        assertEquals("fireball",bowser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBowserTakesAStar(){
        bowser.setPower(power);

        assertEquals("invincibility",bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserTakesAStar(){
        bowser.setPower(power);

        assertEquals("dash",bowser.performBButtonAction());
    }

    @Test
    public void testPowerWhenBowserIsNormal(){
        bowser.setPower(power);

        assertEquals("normal",bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenBowserIsNormal(){
        bowser.setPower(power);

        assertEquals("nothing",bowser.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        bowser.setPower(power);

        assertEquals("error",bowser.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        bowser.setPower(power);

        assertEquals("error",bowser.performBButtonAction());
    }
}
