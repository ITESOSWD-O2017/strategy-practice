package com.iteso.nintendo.accelerate.implementations;

import com.iteso.nintendo.Iaccelerate;

public class Normal implements Iaccelerate {

    int speedPercentaje = 50;

    public void speed() {
        System.out.println("You are running at " + speedPercentaje + "% of speed");
    }

}
