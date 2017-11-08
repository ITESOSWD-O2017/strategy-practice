package com.iteso.nintendo;

import com.iteso.behaviors.iAccelerate;
import com.iteso.behaviors.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      protected iAccelerate currentAccelerate;
      protected iPower currentPower;
      private String name;

    public String getAccelerate() {
        return currentAccelerate.getAccelerate();
    }

    public void usePower(){
        return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String performXButtonAction();
    public abstract String performYButtonAction();
    public abstract String performAButtonAction();
    public abstract String performBButtonAction();

    public abstract void setPower();

    public abstract  void setAccelerate();


    public iPower getCurrentPower() {
        return currentPower;
    }

}
