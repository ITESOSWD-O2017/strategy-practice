package com.iteso.nintendo;

import com.iteso.nintendo.Imple.*;
import com.iteso.nintendo.Interfaz.*;

/**
 * Created by Sergio 8/11/2017.
 */
public class Luigi extends NintendoCharacter{

    public Luigi(){
        setCurrentPower("normal");
        setName("Luigi ");
        setSpeed("normal");
        setAccelerate(new SlowAF());
        setPoder(new Shell());
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