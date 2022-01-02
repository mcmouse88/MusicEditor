package com.company.instrument;

public class Flute extends Instrument {

    public Flute() {
        name = "Флейта";
    }

    @Override
    public String printNote() {
        return "\u266a--\u2669";
    }
}
