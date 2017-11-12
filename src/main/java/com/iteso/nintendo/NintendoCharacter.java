package com.iteso.nintendo;

/**
 * Created by Miguel on 10/11/17.
 */
public abstract class NintendoCharacter {
    /**
     * String speed.
     */
      private String speed = null;
    /**
     * String name.
     */
    private String name = null;
    /**
     * String currentPower.
     */
      private String currentPower = null;
    /**
     * String accel.
     */
    private boolean accel = false;
    /**
     * String accelerationType.
     */
      private boolean accelerationType = false;

    /**
     *
     * @return String devuelve la velocidad.
     */
    public final String getSpeed() {
        return speed;
    }

    /**
     * accelerate.
     */
    public final void accelerate() {
        this.accel = true;
    }
    /**
     * decelerate.
     */
    public final void decelerate() {
        this.accel = false;
    }

    /**
     *
     * @param accelerationType1 es el tipo de aceleración que va a recibir.
     */
    public final void setAcceleration(final IAccelerate accelerationType1) {
       if (accel) {
           setSpeed(accelerationType1.accel(this.speed));
       } else {
           setSpeed(accelerationType1.decel(this.speed));
       }
    }

    /**
     *
     * @param speed1 establece la velocidad.
     */
    public final void setSpeed(final String speed1) {
        this.speed = speed1;
    }

    /**
     *
     * @return regresa el nombre.
     */
    public final String getName() {
        return name;
    }

    /**
     *
     * @param name1 establece el nombre.
     */
    public final void setName(final String name1) {
        this.name = name1;
    }

    /**
     *
     * @return String accion del boton.
     */
    public abstract String performXButtonAction();
    /**
     *
     * @return String accion del boton.
     */
    public abstract String performYButtonAction();
    /**
     *
     * @return String accion del boton.
     */
    public abstract String performAButtonAction();
    /**
     *
     * @return String accion del boton.
     */
    public abstract String performBButtonAction();

    /**
     *
     * @param powerItem es el power item que se va a usar.
     */
    public abstract void setPower(IPower powerItem);

    /**
     *
     * @param type el tipo de aceleración.
     *
     */
    public final void setAccelerationType(final boolean type) {
        this.accelerationType = type;
    }

    /**
     *
     * @return un booleano que regresa el tipo de aceleracion que usamos.
     */
    public final boolean getAccelType() {
        return this.accelerationType;
    }

    /**
     *
     * @return el poder actual.
     */
    public final String getCurrentPower() {
        return currentPower;
    }

    /**
     *
     * @param currentPower1 establece el poder actual.
     */
    public final void setCurrentPower(final String currentPower1) {
        this.currentPower = currentPower1;
    }
}
