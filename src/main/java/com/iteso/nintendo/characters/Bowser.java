package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.FastAccelerate;
import com.iteso.nintendo.items.ShellPower;

public class Bowser extends NintendoCharacter {

    public Bowser(){
        setPower(new ShellPower());
        setName("Bowser");
        setSpeed("normal");
        setCurrentAccelerate(new FastAccelerate());
    }

    public String performXButtonAction() {
        return null;
    }

    public String performYButtonAction() {
        return null;
    }

    public String performAButtonAction() {
        return null;
    }

}
