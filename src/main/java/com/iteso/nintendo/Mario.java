package com.iteso.nintendo;


import com.iteso.nintendo.Imple.*;
import com.iteso.nintendo.Interfaz.*;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter{

    public Mario(){
        setCurrentPower("normal");
        setName("Mario");
        setSpeed("normal");
        setAccelerate(new Fast());
        setPoder(new Flower());
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