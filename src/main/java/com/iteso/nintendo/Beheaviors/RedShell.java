package com.iteso.nintendo.Beheaviors;
import com.iteso.nintendo.Interfaces.iPower;

public class RedShell implements iPower  {
    public String name(){
    return "Tortuga Roja";
}
    public String info(){
        return "El caparazón rojo que apunta directamente al competidor más cercano";

    }
    public boolean doble(){
        return true;
    }
}
