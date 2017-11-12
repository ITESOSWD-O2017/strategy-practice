package com.iteso.nintendo.com.iteso.impl;

import com.iteso.nintendo.IPower;

/**
 * Class Star.
 */
public class Star implements IPower {
    /**
     *
     * @return String el poder.
     */
    public final String getPower() {
        return "star";
    }

    /**
     *
     * @return String prepara el poder.
     */
    public final String preparePower() {
        return "Light character";
    }

    /**
     *
     * @return String lanza el poder.
     */
    public final String releasePower() {
        return "invincibility";
    }
}
