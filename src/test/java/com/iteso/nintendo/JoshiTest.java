package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.*;
import com.iteso.behaviors.implementations.Error;
import com.iteso.characters.Joshi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AleSahagun on 08/11/17.
 */
public class JoshiTest {
    Joshi joshi;
    IPower flower = new Flower();
    IPower redTurtle = new RedTurtle();
    IPower star = new Star();
    IPower nothing = new Nothing();
    IPower error = new Error();

    IAccelerate normal = new Normal();
    IAccelerate slow = new Slow();
    IAccelerate fast = new Fast();

    @Before
    public void setUp(){
        joshi = new Joshi();
    }

    @Test
    public void testPowerWhenJoshiTakesAFlower(){
        joshi.setCurrentPower(flower);
        assertEquals("I will burn everyone", joshi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenJoshiTakesAFlower(){
        joshi.setCurrentPower(flower);
        assertEquals("fireball", joshi.performBButtonAction());
    }

    @Test
    public void testPowerWhenJoshiTakesARedTurtle(){
        joshi.setCurrentPower(redTurtle);
        assertEquals("My power is amazing", joshi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenJoshiTakesARedTurtle(){
        joshi.setCurrentPower(redTurtle);
        assertEquals("shell", joshi.performBButtonAction());
    }

    @Test
    public void testPowerWhenJoshiTakesAStar(){
        joshi.setCurrentPower(star);
        System.out.print(joshi.getCurrentPower().getPower());
        assertEquals("I'm amazing and invincible!", joshi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenJoshiTakesAStar(){
        joshi.setCurrentPower(star);
        System.out.print(joshi.performBButtonAction());
        assertEquals("invincibility", joshi.performBButtonAction());
    }

    @Test
    public void testPowerWhenJoshiIsNormal(){
        joshi.setCurrentPower(nothing);
        assertEquals("I haven't any power", joshi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenJoshiIsNormal(){
        joshi.setCurrentPower(nothing);
        assertEquals("nothing", joshi.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        joshi.setCurrentPower(error);
        assertEquals("Error! You can't have any power", joshi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenError(){
        joshi.setCurrentPower(error);
        assertEquals("error", joshi.performBButtonAction());
    }

    @Test
    public void testAccelerateWhenJoshiHasNormalSpeed(){
        joshi.setAcceleration(normal);
        assertEquals("Go go go", joshi.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenJoshiIsFast(){
        joshi.setAcceleration(fast);
        assertEquals("Your speed increased by 200 percent, you are the most speed", joshi.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenJoshiIsSlow(){
        joshi.setAcceleration(slow);
        assertEquals("Woo woo woooooo", joshi.getAcceleration().accelerate());
    }

}