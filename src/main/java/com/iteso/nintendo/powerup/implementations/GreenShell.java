package com.iteso.nintendo.powerup.implementations;

import com.iteso.nintendo.Ipower;

public class GreenShell implements Ipower {

    int items = 3;

    public int getItems(){
        return items;
    }

    public void backThrow(){
        if(items > 0) {
            items--;
            System.out.println("Throws green shell backwards, " + items + " green shells left");
        }
        else
            System.out.println("You have no green shells");
    }

    public void frontThrow(){
        if(items > 0) {
            items--;
            System.out.println("Throws green shell to the front, " + items + " green shells left");
        }
            else
            System.out.println("You have no green shells");
    }

    public void discard(){
        if(items > 0) {
            items--;
            System.out.println("Green shell discarded, " + items + " green shells left");
        }
        else
            System.out.println("You can't discard one more, you have no green shells left");
    }

}
