package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.VeryFastAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;

public class Birdo extends NintendoCharacter {

    public Birdo () {
        setCurrentAccelerate(new VeryFastAccelerate());
        setName("Birdo");
        setPower(new ShellPower());
        setSpeed("normal");
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
