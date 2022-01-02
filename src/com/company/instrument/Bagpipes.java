package com.company.instrument;

public class Bagpipes extends Instrument {

    public Bagpipes() {
        name = "Волынка";
    }

    @Override
    public String printNote() {
        return "\u2669--\u266a";
    }
}
