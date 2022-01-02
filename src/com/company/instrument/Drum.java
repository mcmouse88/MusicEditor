package com.company.instrument;

public class Drum extends Instrument {

    public Drum() {
        name = "Барабан";
    }

    @Override
    public String printNote() {
        return "\u266a--\u266b";
    }
}
