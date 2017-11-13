package com.iteso.nintendo.powerup.implementations;

import com.iteso.nintendo.Ipower;

public class Star implements Ipower{

    int items = 1;

    public int getItems(){
        return items;
    }

    public void backThrow(){
        if(items > 0) {
            items--;
            System.out.println("You Used a Star, you are Invincible");
        }
        else
            System.out.println("You have no stars");

    }

    public void frontThrow(){
        if(items > 0) {
            items--;
            System.out.println("You Used a Star, you are Invincible");
        }
        else
            System.out.println("You have no stars");
    }

    public void discard(){
        if(items > 0) {
            items--;
            System.out.println("You discarded a Star");
        }
        else
            System.out.println("You have no stars to discard");

    }

}
