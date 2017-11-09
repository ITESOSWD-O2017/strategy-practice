package com.iteso.nintendo.Implementations;

import com.iteso.nintendo.Interfaces.iPower;

public class powerStar implements iPower {

    public String usePower(){
        return "Im using the power";
    }

    public String powerForward() {
        return "Can't throw this power forwards";
    }

    public String powerBackwards() {
        return "Can't throw this power backwards";
    }


}
