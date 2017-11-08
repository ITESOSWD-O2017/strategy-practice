package com.iteso.nintendo.Beheaviors;
import com.iteso.nintendo.Interfaces.iPower;

public class ChompChomp implements iPower {
    public String name(){
        return "Chain Chomp";
    }
    public String info(){
        return "La bola negra que te persigue por ciertos kms";
    }
    public boolean doble(){
        return true;
    }

}
