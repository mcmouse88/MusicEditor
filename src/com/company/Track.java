package com.company;

import com.company.instrument.*;

public class Track {
    final int SONG_LENGTH = 10;
    Instrument[] timeline = new Instrument[SONG_LENGTH];

    public Track(Instrument instrument, Instrument instr1, Instrument instr2) {
        for (int i = 0; i < timeline.length; ++i) {
            if (i % 4 == 0) {
                timeline[i] = instr1;
            } else if (i % 2 == 0) {
                timeline[i] = instr2;
            } else {
                timeline[i] = instrument;
            }
        }
    }

    public void print() {
        for (Instrument instrument : timeline) {
            System.out.print(instrument.printNote());
        }
    }
}
