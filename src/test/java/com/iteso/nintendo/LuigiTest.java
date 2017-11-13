package com.iteso.nintendo;

import com.iteso.nintendo.powerup.implementations.Fireball;
import com.iteso.nintendo.powerup.implementations.Normal;
import com.iteso.nintendo.powerup.implementations.Star;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
        luigi.setPower(new Fireball());

        assertThat(luigi.getCurrentPower(), instanceOf(Fireball.class));
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
        luigi.setPower(new Fireball());

        assertEquals("Front Throw", luigi.performBButtonAction());
        luigi.performBButtonAction();
        luigi.performBButtonAction();
        luigi.performBButtonAction();
        luigi.performBButtonAction();
        luigi.performBButtonAction();
        luigi.performBButtonAction();
        luigi.performBButtonAction();
        luigi.performBButtonAction();
        luigi.performBButtonAction();
    }

    @Test
    public void testPowerWhenLuigiTakesAStar(){
        luigi.setPower(new Star());

        assertThat(luigi.getCurrentPower(), instanceOf(Star.class));
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
        luigi.setPower(new Star());

        assertEquals("Front Throw", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal(){
        luigi.setPower(new Normal());

        assertThat(luigi.getCurrentPower(), instanceOf(Normal.class));
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setPower(new Normal());

        assertEquals("Front Throw", luigi.performBButtonAction());
    }

}
