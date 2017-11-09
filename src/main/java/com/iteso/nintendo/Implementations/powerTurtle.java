package com.iteso.nintendo.Implementations;
import com.iteso.nintendo.Interfaces.iPower;

public class powerTurtle implements iPower {

    public String usePower(){

        return "Im throwing the turtle!";
    }
    public String powerForward(){

        return "Im throwing the turtle to the character in front";
    }
    public String powerBackwards(){

        return "Im throwing the turtle to the character in the back";
    }
}
