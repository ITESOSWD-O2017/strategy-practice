package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.*;
import com.iteso.behaviors.implementations.Error;
import com.iteso.characters.Mario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class MarioTest {
    Mario mario;
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
        mario = new Mario();
    }

    @Test
    public void testPowerWhenMarioTakesAFlower(){
        mario.setCurrentPower(flower);
        assertEquals("I will burn everyone", mario.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenMarioTakesAFlower(){
        mario.setCurrentPower(flower);
        assertEquals("fireball", mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesARedTurtle(){
        mario.setCurrentPower(redTurtle);
        assertEquals("My power is amazing", mario.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenMarioTakesARedTurtle(){
        mario.setCurrentPower(redTurtle);
        assertEquals("shell", mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioTakesAStar(){
        mario.setCurrentPower(star);
        System.out.print(mario.getCurrentPower().getPower());
        assertEquals("I'm amazing and invincible!", mario.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenMarioTakesAStar(){
        mario.setCurrentPower(star);
        System.out.print(mario.performBButtonAction());
        assertEquals("invincibility", mario.performBButtonAction());
    }

    @Test
    public void testPowerWhenMarioIsNormal(){
        mario.setCurrentPower(nothing);
        assertEquals("I haven't any power", mario.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenMarioIsNormal(){
        mario.setCurrentPower(nothing);
        assertEquals("nothing", mario.performBButtonAction());
    }
    @Test
    public void testPowerWhenError(){
        mario.setCurrentPower(error);
        assertEquals("Error! You can't have any power", mario.getCurrentPower().getPower());
    }

    @Test
    public void testBActionWhenError(){
        mario.setCurrentPower(error);
        assertEquals("error", mario.performBButtonAction());
    }

    @Test
    public void testAccelerateWhenMarioHasNormalSpeed(){
        mario.setAcceleration(normal);
        assertEquals("Go go go", mario.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenMarioIsFast(){
        mario.setAcceleration(fast);
        assertEquals("Your speed increased by 200 percent, you are the most speed", mario.getAcceleration().accelerate());
    }

    @Test
    public void testAccelerateWhenMarioIsSlow(){
        mario.setAcceleration(slow);
        assertEquals("Woo woo woooooo", mario.getAcceleration().accelerate());
    }
}