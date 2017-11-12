package com.iteso.nintendo;
import com.iteso.nintendo.Interfaz.Iaccelerate;
import com.iteso.nintendo.Interfaz.Ipower;
/**
 *
 */
public abstract class NintendoCharacter {
    /**
     *
     */
      private String speed = null;
    /**
     *
     */
      private String name = null;
    /**
     *
     */
      private String currentPower = null;
    /**
     *
     */
      private Ipower poder = null;
    /**
     *
     */
      private Iaccelerate accelerate = null;

    /**
     *@return ok
     */
    public final String getSpeed() {
        return speed;
    }
    /**
     *@param speeds This is a parameter
     */
    public final void setSpeed(final String speeds) {
        this.speed = speeds;
    }
    /**
     *@param accelerationType This is a parameter
     */
    public final void setAcceleration(final Iaccelerate accelerationType) {
        setSpeed(accelerationType.accelerate());
    }
    /**
     *@return ok
     */
    public final String getName() {
        return name;
    }
    /**
     *@param names This is a parameter
     */
    public final void setName(final String names) {
        this.name = names;
    }
    /**
     *@return ok
     */
    public abstract String performXButtonAction();
    /**
     *@return ok
     */
    public abstract String performYButtonAction();
    /**
     *@return ok
     */
    public abstract String performAButtonAction();
    /**
     *@return ok
     */
    public final String performBButtonAction() {
       return currentPower;
    }
    /**
     *@param powerItem This is a parameter
     */
    public final void setPower(final Ipower powerItem) {
        setCurrentPower(powerItem.name());
    }
    /**
     *@return ok
     */
    public final String getCurrentPower() {
        return currentPower;
    }
    /**
     *@param currentPowers This is a parameter
     */
    public final void setCurrentPower(final String currentPowers) {
        this.currentPower = currentPowers;
    }
    /**
     *@return ok
     */
    public final Ipower getPoder() {
        return poder;
    }
    /**
     *@param poders This is a parameter
     */
    public final void setPoder(final Ipower poders) {
        this.poder = poders;
    }
    /**
     *@return ok
     */
    public final Iaccelerate getAccelerate() {
        return accelerate;
    }
    /**
     *@param accelerates This is a parameter
     */
    public final void setAccelerate(final Iaccelerate accelerates) {
        this.accelerate = accelerates;
    }
}
