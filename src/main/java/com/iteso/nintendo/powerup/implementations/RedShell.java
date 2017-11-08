package com.iteso.nintendo.powerup.implementations;

import com.iteso.nintendo.Ipower;

public class RedShell implements Ipower {

    int items = 3;

    public int getItems(){
        return items;
    }

    public void backThrow(){
        if(items > 0)
            System.out.println("The player behind you has been beaten by a red shell, " + items + " red shells left");
        else
            System.out.println("You have no red shells");
    }

    public void frontThrow(){
        if(items > 0)
            System.out.println("The player in front of you has been beaten by a red shell, " + items + " red shells left");
        else
            System.out.println("You have no red shells");
    }

    public void discard(){
        if(items > 0)
            System.out.println("Red shell discarded, " + items + " red shells left");
        else
            System.out.println("You can't discard one more, you have no red shells left");
    }

}
