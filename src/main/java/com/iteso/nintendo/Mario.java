package com.iteso.nintendo;

import com.iteso.nintendo.behavior.FastAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;
import com.iteso.nintendo.items.TunderPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter{

    public Mario(){
        setCurrentPower(new ShellPower());
        setName("Mario");
        setSpeed("normal");
        setCurrentAccelerate(new FastAccelerate());
    }

    @Override
    public String performXButtonAction() {
        return null;
    }

    @Override
    public String performYButtonAction() {
        return null;
    }

    @Override
    public String performAButtonAction() {
        return "jump";
    }

    @Override
    public String performBButtonAction() {
        if (getCurrentPower() instanceof ShellPower)
            return "shell";
        else if (getCurrentPower() instanceof StarPower)
            return "star";
        else if (getCurrentPower() instanceof TunderPower)
            return "tunder";
        else
            return "error";
    }

    @Override
    public void setPower(String powerItem) {
        if (getCurrentPower() != null) {
            return;
        }

        else if(powerItem.toLowerCase() == "shell"){
            setCurrentPower(new ShellPower());
        }
        else if(powerItem.toLowerCase() == "star"){
            setCurrentPower(new StarPower());
            setSpeed("fast");
        }
        else if(powerItem.toLowerCase() == "tunder"){
            setCurrentPower(new TunderPower());
            setSpeed("normal");
        }
        else
            setCurrentPower(null);
    }
}