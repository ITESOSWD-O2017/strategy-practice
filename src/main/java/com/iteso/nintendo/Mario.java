package com.iteso.nintendo;

import com.iteso.Ipower.Normal;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter{

    public Mario(){
        setCurrentPower(new Normal());
        setName("Mario");
        setSpeed("normal");
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