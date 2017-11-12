package com.iteso.nintendo.com.iteso.impl;
import com.iteso.nintendo.IPower;

/**
 * Class Flower.
 */
public class Flower implements IPower {
    /**
     *
     * @return String el poder actual.
     */
    public final String getPower() {
        return "flower";
    }

    /**
     *
     * @return String de como prepara el poder.
     */
    public final String preparePower() {
        return "fire hand";
    }

    /**
     *
     * @return String lanza poder.
     */
    public final String releasePower() {
        return "fire";
    }
}
