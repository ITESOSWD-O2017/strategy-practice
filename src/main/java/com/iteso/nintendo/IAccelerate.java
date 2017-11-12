package com.iteso.nintendo;

/**
 * Interface IAccelerate.
 */
public interface IAccelerate {
    /**
     *
     * @param speed la velocidad de la aceleracion actual
     * @return la nueva velocidad
     */
    String accel(String speed);
    /**
     *
     * @param speed la velocidad de la aceleracion actual
     * @return la nueva velocidad
     */
    String decel(String speed);
}
