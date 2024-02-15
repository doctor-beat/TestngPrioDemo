package com.acceptance.rest;

public class Counter {
    static private int i = 0;

    public static int getAndRaiseCounter() {
        return ++i;
    }
}
