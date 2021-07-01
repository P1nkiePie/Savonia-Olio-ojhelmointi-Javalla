package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Luetiedostosta implements Runnable{

    @Override
    public void run() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna tiedoston nimi: ");
        String tiedosto = lukija.nextLine();
        try {
            System.out.println("Lisää teksti(lopeta lopettaa): ");
            while (true) {
                String lisattava = lukija.nextLine() + "\n";
                if (lisattava.contains("lopeta")) break;
                BufferedWriter writer = new BufferedWriter(new FileWriter(tiedosto, true));
                writer.append(lisattava);
                writer.close();
            }
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
