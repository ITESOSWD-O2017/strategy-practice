package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.*;
import com.iteso.behaviors.implementations.Error;
import com.iteso.characters.Peach;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AleSahagun on 11/11/17.
 */
public class PeachTest {
    Peach peach;
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
        peach = new Peach();
    }

    @Test
    public void testPowerWhenPeachTakesAFlower(){
        peach.setCurrentPower(flower);
        assertEquals("I will burn everyone", peach.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenPeachTakesAFlower(){
        peach.setCurrentPower(flower);
        assertEquals("fireball", peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenPeachTakesARedTurtle(){
        peach.setCurrentPower(redTurtle);
        assertEquals("My power is amazing", peach.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenPeachTakesARedTurtle(){
        peach.setCurrentPower(redTurtle);
        assertEquals("shell", peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenPeachTakesAStar(){
        peach.setCurrentPower(star);
        assertEquals("I'm amazing and invincible!", peach.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenPeachTakesAStar(){
        peach.setCurrentPower(star);
        assertEquals("invincibility", peach.performBButtonAction());
    }

    @Test
    public void testPowerWhenPeachIsNormal(){
        peach.setCurrentPower(nothing);
        assertEquals("I haven't any power", peach.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenPeachIsNormal(){
        peach.setCurrentPower(nothing);
        assertEquals("nothing", peach.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        peach.setCurrentPower(error);
        assertEquals("Error! You can't have any power", peach.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenError(){
        peach.setCurrentPower(error);
        assertEquals("error", peach.performBButtonAction());
    }

    @Test
    public void testAccelerateWhenPeachHasNormalSpeed(){
        peach.setAcceleration(normal);
        assertEquals("Go go go", peach.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenPeachIsFast(){
        peach.setAcceleration(fast);
        assertEquals("Your speed increased by 200 percent, you are the most speed", peach.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenPeachIsSlow(){
        peach.setAcceleration(slow);
        assertEquals("Woo woo woooooo", peach.getAcceleration().accelerate());
    }
}