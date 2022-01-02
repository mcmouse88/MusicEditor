package com.company.instrument;

public class Piano extends Instrument {

    public Piano() {
        name = "Пианино";
    }

    @Override
    public String printNote() {
        return "\u266b--\u266c";
    }
}
