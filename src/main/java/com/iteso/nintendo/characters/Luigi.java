package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.VeryFastAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;
import com.iteso.nintendo.items.TunderPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter{

    public Luigi(){
        setPower(new StarPower());
        setName("Luigi ");
        setSpeed("normal");
        setCurrentAccelerate(new VeryFastAccelerate());
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

}