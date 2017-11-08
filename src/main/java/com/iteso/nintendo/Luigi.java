package com.iteso.nintendo;

import com.iteso.Ipower.Normal;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Luigi extends NintendoCharacter{

    public Luigi(){
        setCurrentPower(new Normal());
        setName("Luigi ");
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