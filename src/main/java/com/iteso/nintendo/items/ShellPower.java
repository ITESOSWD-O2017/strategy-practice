package com.iteso.nintendo.items;

/**
 * Objeto de caparazon.
 */
public class ShellPower implements iPower {


    /**
     * No hace nada.
     */
    public void activatePower() {

    }

    /**
     * Lanza el caparazon hacia enfrente.
     */
    public void frontTrow() {
        System.out.println("Has tirado el caparazón hacia adelante");
    }

    /**
     * Lanza el caparazon hacia atras.
     */
    public void backTrow() {
        System.out.println("Has tirado el caparazón hacia atras");
    }
}
