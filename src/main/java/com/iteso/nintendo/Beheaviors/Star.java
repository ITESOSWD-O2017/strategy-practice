package com.iteso.nintendo.Beheaviors;
import com.iteso.nintendo.Interfaces.iPower;

public class Star implements iPower {
    public String name(){
        return "Estrella";
    }
    public String info(){
        return "Te da un aura muy padre y manda a volar a todo lo que golpee";
    }
    public boolean doble(){
        return true;
    }
}
