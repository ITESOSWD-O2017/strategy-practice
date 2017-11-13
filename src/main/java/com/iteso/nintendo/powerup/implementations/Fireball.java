package com.iteso.nintendo.powerup.implementations;

import com.iteso.nintendo.Ipower;

public class Fireball implements Ipower{

    int items = 10;

    public int getItems(){
        return items;
    }

    public void backThrow(){
        if(items > 0) {
            items--;
            System.out.println("Throws fireball backwards, " + items + " fireballs left");
        }
        else
            System.out.println("You have no fireballs");
    }

    public void frontThrow(){
        if(items > 0) {
            items--;
            System.out.println("Throws fireball to the front, " + items + " fireballs left");
        }
        else
            System.out.println("You have no fireballs");
    }

    public void discard(){
        if(items > 0) {
            items--;
            System.out.println("Fireball discarded, " + items + " fireballs left");
        }
        else
            System.out.println("You can't discard one more, you have no fireballs left");
    }

}
