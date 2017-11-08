package com.iteso.nintendo;

public abstract class iAccelerate {

    private String description = null;

    public String getDescription(){ return description; }

    public void setDescription(String description){ this.description = description; }

    public abstract void speed();
}
