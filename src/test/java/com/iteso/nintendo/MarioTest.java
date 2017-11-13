package com.iteso.nintendo;

import static org.hamcrest.CoreMatchers.instanceOf;
import com.iteso.nintendo.powerup.implementations.Fireball;
import com.iteso.nintendo.powerup.implementations.Normal;
import com.iteso.nintendo.powerup.implementations.Star;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class MarioTest {
    Mario mario;

    @Before
    public void setUp(){
        mario = new Mario();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower(){
        mario.setPower(new Fireball());

        assertThat(mario.getCurrentPower(), instanceOf(Fireball.class));
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        mario.setPower(new Fireball());

        assertEquals("Front Throw", mario.performBButtonAction());
        mario.performBButtonAction();
        mario.performBButtonAction();
        mario.performBButtonAction();
        mario.performBButtonAction();
        mario.performBButtonAction();
        mario.performBButtonAction();
        mario.performBButtonAction();
        mario.performBButtonAction();
        mario.performBButtonAction();
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        mario.setPower(new Star());

        assertThat(mario.getCurrentPower(), instanceOf(Star.class));
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        mario.setPower(new Star());

        assertEquals("Front Throw", mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        mario.setPower(new Normal());

        assertThat(mario.getCurrentPower(), instanceOf(Normal.class));
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        mario.setPower(new Normal());

        assertEquals("Front Throw", mario.performBButtonAction());
    }
}
