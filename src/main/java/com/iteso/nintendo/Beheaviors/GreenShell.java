package com.iteso.nintendo.Beheaviors;
import com.iteso.nintendo.Interfaces.iPower;


public class GreenShell implements iPower {
    public String name(){
        return "Tortuga Verde";
    }
    public String info(){
        return "El caparazón verde que solo avanza recto, sin apuntar a nadie";
    }
    public boolean doble(){
        return true;
    }
}
