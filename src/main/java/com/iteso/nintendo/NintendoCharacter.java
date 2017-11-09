package com.iteso.nintendo;

import com.iteso.behaviors.IAccelerate;
import com.iteso.behaviors.IPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
    /**Acceleration variable.
     */
    private IAccelerate currentAccelerate;
    /**Power variable.
     */
    private IPower currentPower;
    /**Name attribute variable.
     */
    private String name;
    /**
     * Getting acceleration.
     * @return acceleration.
     */
    public final String getAccelerate() {
        return currentAccelerate.getAccelerate();
    }
    /**
     * Getting name.
     * @return name.
     */
    public final String getName() {
        return name;
    }
    /**
     * Getting power.
     * @return name.
     */
    public final String getPower() {
        return this.currentPower.getPower();
    }
    /**
     * Performing X action.
     * @return power usage.
     */
    public final String performXButtonAction() {
        return currentPower.usePower();
    }
    /**
     * Performing Y action.
     * @return deceleration.
     */
    public final String performYButtonAction() {
        return currentAccelerate.decelerate();
    }
    /**
     * Performing A action.
     * @return jump.
     */
    public final String performAButtonAction() {
        return "jump";
    }
    /**
     * Performing B action.
     * @return acceleration.
     */
    public final String performBButtonAction() {
        return currentAccelerate.accelerate();
    }
    /**
     * Name setter.
     * @param charName Nintendo character name.
     */
    protected final void setName(final String charName) {
        this.name = charName;
    }
    /**
     * Power setter.
     * @param power receives a power.
     * @return power.
     */
    protected final String setPower(final IPower power) {
        if (power == null) {
            return "Please assign a power";
        } else {
            this.currentPower = power;
            return "OK";
        }
    }
    /**
     * Acceleration setter.
     * @param acceleration receives acceleration.
     */
    protected final void setAccelerate(final IAccelerate acceleration) {
        this.currentAccelerate = acceleration;
    }

}
