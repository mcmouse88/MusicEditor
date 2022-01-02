package com.company.instrument;

public class Guitar extends Instrument {

    public Guitar() {
        name = "Гитара";
    }

    @Override
    public String printNote() {
        return "\u266a--\u266c";
    }
}
