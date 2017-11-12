package com.iteso.nintendo;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.NormalMode;
import com.iteso.nintendo.Mario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class MarioTest {
    Mario mario;
    IPower power = new NormalMode();

    @Before
    public void setUp(){
        mario = new Mario();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower(){
        mario.setPower(power);

        assertEquals("fire",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        mario.setPower(power);

        assertEquals("fireball",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        mario.setPower(power);

        assertEquals("invincibility",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        mario.setPower(power);

        assertEquals("dash",mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        mario.setPower(power);

        assertEquals("normal",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        mario.setPower(power);

        assertEquals("nothing",mario.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        mario.setPower(power);

        assertEquals("error",mario.getCurrentPower());
    }

    @Test
    public void testBActionWhenError(){
        mario.setPower(power);

        assertEquals("error",mario.performBButtonAction());
    }

}
