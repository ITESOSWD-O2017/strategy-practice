package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.SlowAccelerate;

public class Yoshi extends NintendoCharacter {

    public Yoshi () {
        setCurrentAccelerate(new SlowAccelerate());
        setName("Bowser");
        setSpeed("normal");
        setCurrentAccelerate(new SlowAccelerate());
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
