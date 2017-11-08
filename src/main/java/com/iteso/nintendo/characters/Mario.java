package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.FastAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;
import com.iteso.nintendo.items.TunderPower;
import com.iteso.nintendo.items.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {

    public Mario(){
        setPower(new ShellPower());
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


}