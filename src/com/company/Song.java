package com.company;

import java.util.LinkedList;

public class Song {
    private String name;

    public Song(String name) {
        this.name = name;
    }

    public void print(LinkedList<Track> tracks) {
        System.out.println(name + " воспроизводится");
        for (Track track : tracks) {
            track.print();
            System.out.println();
        }
    }
}
