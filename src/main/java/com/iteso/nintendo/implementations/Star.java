package com.iteso.nintendo.implementations;

import com.iteso.nintendo.behavior.iPower;

public class Star implements iPower {
    public String Activate() {

        return "Star";
    }

    public String frontThrow() {

        return "Can't Throw";
    }

    public String backThrow() {

        return "Can't Throw";
    }
}
