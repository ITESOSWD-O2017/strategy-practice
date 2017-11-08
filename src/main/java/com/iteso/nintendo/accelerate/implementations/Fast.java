package com.iteso.nintendo.accelerate.implementations;

import com.iteso.nintendo.Iaccelerate;

public class Fast implements Iaccelerate {

    int speedPercentaje = 90;

    public void speed() {
        System.out.println("You are running at " + speedPercentaje + "% of speed");
    }
}
