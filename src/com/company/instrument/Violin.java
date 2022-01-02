package com.company.instrument;

public class Violin extends Instrument {

    public Violin() {
        name = "Скрипка";
    }

    @Override
    public String printNote() {
        return "\u266c--\u266a";
    }
}
