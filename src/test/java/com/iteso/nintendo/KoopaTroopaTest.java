package com.iteso.nintendo;

import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.NormalMode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KoopaTroopaTest {
    KoopaTroopa koopa;
    IPower power = new NormalMode();

    @Before
    public void setUp(){
        koopa = new KoopaTroopa();
    }

    @Test
    public void testPowerWhenKoopaTroopaTakesAFlower(){
        koopa.setPower(power);

        assertEquals("fire",koopa.getCurrentPower());
    }

    @Test
    public void testBActionWhenKoopaTroopaTakesAFlower(){
        koopa.setPower(power);

        assertEquals("fireball",koopa.performBButtonAction());
    }

    @Test
    public void testPowerWhenKoopaTroopaTakesAStar(){
        koopa.setPower(power);

        assertEquals("invincibility",koopa.getCurrentPower());
    }

    @Test
    public void testBActionWhenKoopaTroopaTakesAStar(){
        koopa.setPower(power);

        assertEquals("dash",koopa.performBButtonAction());
    }

    @Test
    public void testPowerWhenKoopaTroopaIsNormal(){
        koopa.setPower(power);

        assertEquals("normal",koopa.getCurrentPower());
    }

    @Test
    public void testBActionWhenKoopaTroopaIsNormal(){
        koopa.setPower(power);

        assertEquals("nothing",koopa.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        koopa.setPower(power);

        assertEquals("error",koopa.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        koopa.setPower(power);

        assertEquals("error",koopa.performBButtonAction());
    }
}
