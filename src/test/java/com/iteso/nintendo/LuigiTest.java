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
public class LuigiTest {
    Luigi luigi;
    IPower nPower = new NormalPower();
    IAccelerate accelerate;
    IPower nullPower;

    @Before
    public void setUp(){
        luigi = new Luigi();
    }

    @Test
    public void testPower(){
        luigi.setPower(nPower);
        assertEquals("Normal",luigi.getPower());
    }

    @Test
    public void testBButton(){
        assertEquals("I'm going at normal speed!!!",luigi.performBButtonAction());
    }

    @Test
    public void testAButton(){
        assertEquals("jump",luigi.performAButtonAction());
    }

    @Test
    public void testYButton(){
        assertEquals("I'm slowing down!!",luigi.performYButtonAction());
    }

    @Test
    public void testXButton(){
        luigi.setPower(nPower);
        assertEquals("I'll do nothing :s",luigi.performXButtonAction());
    }

    @Test
    public void testPowerWhenError(){
        assertEquals("Please assign a power",luigi.setPower(nullPower));
    }

}
