package com.iteso.nintendo.com.iteso.impl;

import com.iteso.nintendo.IPower;
/**
 * Class Clear.
 */
public class Clear implements IPower {
    /**
     *
     * @return String el poder actual.
     */
    public final String getPower() {
        return "clear power";
    }

    /**
     *
     * @return String de como se prepara el poder.
     */
    public final String preparePower() {
        return "Vanish all";
    }

    /**
     *
     * @return String de como se lanza el poder.
     */
    public final String releasePower() {
        return "normal";
    }
}
