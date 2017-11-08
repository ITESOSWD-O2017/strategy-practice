package com.iteso.nintendo.implementations;

import com.iteso.nintendo.behavior.iPower;

public class RedShell implements iPower {
    public String Activate() {

        return "Red Shell";
    }

    public String frontThrow() {

        return "Chase the on in front of you";
    }

    public String backThrow() {

        return "Go Straight";
    }
}
