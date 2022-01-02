package com.company;

import com.company.instrument.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[]{
                new Bagpipes(),
                new Drum(),
                new Flute(),
                new Guitar(),
                new Piano(),
                new Saxophone(),
                new Violin()
        };
        Instrument instrument = new Instrument();
        LinkedList<Track> tracks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название песни");
        String name = scanner.nextLine();
        boolean isTrue = true;
        while (isTrue) {
            printList(instruments);
            System.out.println("Введите два инструмента из списка через пробел, для создания трека, либо введите \"exit\" для выхода");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                String[] parts = input.split("\\s");
                int instr1 = Integer.parseInt(parts[0]) - 1;
                int instr2 = Integer.parseInt(parts[1]) - 1;
                tracks.add(new Track(instruments[instr1], instruments[instr2], instrument));
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Нет такого инструмента в списке");
                continue;
            }
            while (isTrue) {
                System.out.println("Нажмите \"1\" для создания еще одного трека, или нажмите \"2\" для завершения редактирования");
                String choose = scanner.nextLine();
                if (choose.equals("1")) {
                    break;
                } else if (choose.equals("2")) {
                    isTrue = false;
                } else {
                    System.out.println("Неверное значение");
                }
            }
        }
        Song song = new Song(name);
        song.print(tracks);
    }

    public static void printList(Instrument[] instruments) {
        for (int i = 0; i < instruments.length; i++) {
            System.out.println(i + 1 + "." + instruments[i].getName());
        }
    }
}
