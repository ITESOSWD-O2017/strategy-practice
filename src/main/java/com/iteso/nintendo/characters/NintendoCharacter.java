package com.iteso.nintendo.characters;

import com.iteso.nintendo.behavior.iAccelerate;
import com.iteso.nintendo.items.ShellPower;
import com.iteso.nintendo.items.StarPower;
import com.iteso.nintendo.items.TunderPower;
import com.iteso.nintendo.items.iPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
      private String speed = null;
      private String name = null;
      private iPower currentPower = null;
      private iAccelerate currentAccelerate = null;


    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
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
    public  String performBButtonAction() {
        {
            if (getCurrentPower() instanceof ShellPower)
                return "shell";
            else if (getCurrentPower() instanceof StarPower)
                return "star";
            else if (getCurrentPower() instanceof TunderPower)
                return "tunder";
            else
                return "error";
        }
    };


    public iPower getCurrentPower() {
        return currentPower;
    }

    public void setPower(iPower currentPower) {
        this.currentPower = currentPower;
    }

    public iAccelerate getCurrentAccelerate() {
        return currentAccelerate;
    }

    public void setCurrentAccelerate(iAccelerate currentAccelerate) {
        this.currentAccelerate = currentAccelerate;
    }
}
