package com.iteso.nintendo.Implementations;
import com.iteso.nintendo.Interfaces.iPower;

public class powerBanana implements iPower {

    public String usePower(){

        return "Im throwing the banana!";
    }
    public String powerForward(){

        return "Im throwing the banana to the character in front";
    }
    public String powerBackwards(){
        return "Im throwing the banana to the character in the back";
    }

}

