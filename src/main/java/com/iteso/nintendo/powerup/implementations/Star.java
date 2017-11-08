package com.iteso.nintendo.powerup.implementations;

import com.iteso.nintendo.Ipower;

public class Star implements Ipower{

    int items = 1;

    public int getItems(){
        return items;
    }

    public void backThrow(){
        System.out.println("You Used a Star, you are Invincible");

    }

    public void frontThrow(){
        System.out.println("You Used a Star, you are Invincible");
    }

    public void discard(){
        System.out.println("You discarded a Star");
    }

}
