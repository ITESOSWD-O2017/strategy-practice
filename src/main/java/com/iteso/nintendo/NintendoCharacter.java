package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {

    /** Name. */
    private String name = "";
    /** IAccelerate. */
    private IAccelerate acceleration = null;
    /** IPower. */
    private IPower currentPower = null;

    /** @return name. */
    public final String getName() {
        return name;
    }

    /** @param n */
    public final void setName(final String n) {
        this.name = n;
    }

    /** @return IAccelerate. */
    public final IAccelerate getAcceleration() {
        return acceleration;
    }

    /** @param acc */
    public final void setAcceleration(final IAccelerate acc) {
        this.acceleration = acceleration;
    }

    /** @return IPower */
    public final IPower getCurrentPower() {
        return currentPower;
    }

    /** @param cPower */
    public final void setCurrentPower(final IPower cPower) {
        this.currentPower = currentPower;
    }

    /** @return String. */
    public abstract String performXButtonAction();
    /** @return String. */
    public abstract String performYButtonAction();
    /** @return String. */
    public abstract String performAButtonAction();
    /** @return String. */
    public abstract String performBButtonAction();

}
