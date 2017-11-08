package com.iteso.nintendo.powerup.implementations;

import com.iteso.nintendo.Ipower;

public class Normal implements Ipower {

    int items = 0;

    public int getItems(){
        return items;
    }

    public void backThrow(){
            System.out.println("Nothing");

    }

    public void frontThrow(){
            System.out.println("Nothing");
    }

    public void discard(){
            System.out.println("Nothing");
    }

}
