package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.*;
import com.iteso.behaviors.implementations.Error;
import com.iteso.characters.Koopa;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AleSahagun on 11/11/17.
 */
public class KoopaTest {
    Koopa koopa;
    IPower flower = new Flower();
    IPower redTurtle = new RedTurtle();
    IPower star = new Star();
    IPower nothing = new Nothing();
    IPower error = new Error();

    IAccelerate normal = new Normal();
    IAccelerate slow = new Slow();
    IAccelerate fast = new Fast();

    @Before
    public void setUp() {
        koopa = new Koopa();
    }

    @Test
    public void testPowerWhenKoopaTakesAFlower(){
        koopa.setCurrentPower(flower);
        assertEquals("I will burn everyone", koopa.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenKoopaTakesAFlower(){
        koopa.setCurrentPower(flower);
        assertEquals("fireball", koopa.performBButtonAction());
    }

    @Test
    public void testPowerWhenKoopaTakesARedTurtle(){
        koopa.setCurrentPower(redTurtle);
        assertEquals("My power is amazing", koopa.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenKoopaTakesARedTurtle(){
        koopa.setCurrentPower(redTurtle);
        assertEquals("shell", koopa.performBButtonAction());
    }

    @Test
    public void testPowerWhenKoopaTakesAStar(){
        koopa.setCurrentPower(star);
        assertEquals("I'm amazing and invincible!", koopa.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenKoopaTakesAStar(){
        koopa.setCurrentPower(star);
        assertEquals("invincibility", koopa.performBButtonAction());
    }

    @Test
    public void testPowerWhenKoopaIsNormal(){
        koopa.setCurrentPower(nothing);
        assertEquals("I haven't any power", koopa.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenKoopaIsNormal(){
        koopa.setCurrentPower(nothing);
        assertEquals("nothing", koopa.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        koopa.setCurrentPower(error);
        assertEquals("Error! You can't have any power", koopa.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenError(){
        koopa.setCurrentPower(error);
        assertEquals("error", koopa.performBButtonAction());
    }

    @Test
    public void testAccelerateWhenKoopaHasNormalSpeed(){
        koopa.setAcceleration(normal);
        assertEquals("Go go go", koopa.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenKoopaIsFast(){
        koopa.setAcceleration(fast);
        assertEquals("Your speed increased by 200 percent, you are the most speed", koopa.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenKoopaIsSlow(){
        koopa.setAcceleration(slow);
        assertEquals("Woo woo woooooo", koopa.getAcceleration().accelerate());
    }
}