package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.*;
import com.iteso.behaviors.implementations.Error;
import com.iteso.characters.Luigi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class LuigiTest {
    Luigi luigi;
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
        luigi = new Luigi();
    }

    @Test
    public void testPowerWhenLuigiTakesAFlower(){
        luigi.setCurrentPower(flower);
        assertEquals("I will burn everyone", luigi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAFlower(){
        luigi.setCurrentPower(flower);
        assertEquals("fireball", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesARedTurtle(){
        luigi.setCurrentPower(redTurtle);
        assertEquals("My power is amazing", luigi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenLuigiTakesARedTurtle(){
        luigi.setCurrentPower(redTurtle);
        assertEquals("shell", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiTakesAStar(){
        luigi.setCurrentPower(star);
        System.out.print(luigi.getCurrentPower().getPower());
        assertEquals("I'm amazing and invincible!", luigi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenLuigiTakesAStar(){
        luigi.setCurrentPower(star);
        System.out.print(luigi.performBButtonAction());
        assertEquals("invincibility", luigi.performBButtonAction());
    }

    @Test
    public void testPowerWhenLuigiIsNormal(){
        luigi.setCurrentPower(nothing);
        assertEquals("I haven't any power", luigi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenLuigiIsNormal(){
        luigi.setCurrentPower(nothing);
        assertEquals("nothing", luigi.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        luigi.setCurrentPower(error);
        assertEquals("Error! You can't have any power", luigi.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenError(){
        luigi.setCurrentPower(error);
        assertEquals("error", luigi.performBButtonAction());
    }

    @Test
    public void testAccelerateWhenLuigiHasNormalSpeed(){
        luigi.setAcceleration(normal);
        assertEquals("Go go go", luigi.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenLuigiiIsFast(){
        luigi.setAcceleration(fast);
        assertEquals("Your speed increased by 200 percent, you are the most speed", luigi.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenLuigiIsSlow(){
        luigi.setAcceleration(slow);
        assertEquals("Woo woo woooooo", luigi.getAcceleration().accelerate());
    }

}
