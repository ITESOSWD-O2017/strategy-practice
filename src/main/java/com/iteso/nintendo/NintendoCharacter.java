package com.iteso.nintendo;
import com.iteso.behaviors.Iaccelerate;
import com.iteso.behaviors.IPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public abstract class NintendoCharacter {
    /**
     * Variable name.
     */
    private String name = null;
    /**
     * variable speed.
     */
    private String speed = null;
    /**
     * variable current power.
     */
    private String currentPower = null;
    /**
     * variable acceleration status.
     */
    private Iaccelerate accelerateStatus;
    /**
     * variable power status.
     */
    private IPower powerStatus;

    /**
     * set speed.
     * @param speedd speed.
     */
    public final void setSpeed(final String speedd) {
        this.speed = speed;
    }

    /**
     * acceleration.
     * @return acceleration.
     */
    public final String acceleration() {
        return accelerateStatus.acceleration();
    }

    /**
     * character name.
     * @return name.
     */
    public final String getName() {
        return name;
    }

    /**
     * set name.
     * @param namee name.
     */
    public final void setName(final String namee) {
        this.name = name;
    }

    /**
     *
     * @param powerItem power.
     */
    public abstract void setPower(IPower powerItem);

    /**
     *
     * @param acceleration acceleration.
     */
    public abstract void setAcceleration(Iaccelerate acceleration);

    /**
     * get status.
     * @return power.
     */
    public final IPower getCurrentPower() {
        return powerStatus;
    }

    /**
     * currentPower.
     * @param currentPowerr power.
     */
    public final void setCurrentPower(final String currentPowerr) {
        this.currentPower = currentPower;
    }

    /**
     * Performing X action.
     * @return power usage.
     */
    public final String performXButtonAction() {
        return powerStatus.throwForward();
    }
    /**
     * Performing Y action.
     * @return deceleration.
     */
    public final String performYButtonAction() {
        return accelerateStatus.slowDown();
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
        return accelerateStatus.startAccelerating();
    }

}
