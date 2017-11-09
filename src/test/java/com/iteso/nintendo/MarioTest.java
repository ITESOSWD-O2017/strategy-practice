package com.iteso.nintendo;
import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;
import com.iteso.behaviors.implementations.BananaPower;
import com.iteso.behaviors.implementations.FlowerPower;
import com.iteso.behaviors.implementations.NormalPower;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class MarioTest {
    Mario mario;
    IPower nPower = new NormalPower();
    IPower nullPower;

    @Before
    public void setUp(){
        mario = new Mario();
    }

    @Test
    public void testPowerNormal(){
        mario.setPower(nPower);
        assertEquals("Normal",mario.getPower());
    }

    @Test
    public void testBButton(){
        mario.setPower(nPower);
        assertEquals("I'm going at normal speed!!!",mario.performBButtonAction());
    }

    @Test
    public void testAButton(){
        assertEquals("jump",mario.performAButtonAction());
    }

    @Test
    public void testYButton(){
        assertEquals("I'm slowing down!!",mario.performYButtonAction());
    }

    @Test
    public void testXButton(){
        mario.setPower(nPower);
        assertEquals("I'll do nothing :s",mario.performXButtonAction());
    }

    @Test
    public void testPowerWhenError(){
        assertEquals("Please assign a power",mario.setPower(nullPower));
    }

}
