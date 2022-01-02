package com.company.instrument;

public class Saxophone extends Instrument {

    public Saxophone() {
        name = "Саксофон";
    }

    @Override
    public String printNote() {
        return "\u266c--\u266b";
    }
}
