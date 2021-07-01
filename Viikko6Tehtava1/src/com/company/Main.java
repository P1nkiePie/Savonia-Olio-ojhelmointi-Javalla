package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Runnable tulostaTahti = new PrintDiamond();

        Thread saie1 = new Thread(tulostaTahti);
        saie1.run();

        System.out.print("Montako säiettä käynnistetään? ");
        int luku = Integer.valueOf(lukija.nextLine());

        for (int i=0; i<luku; i++) {
            Thread saie = new Thread(tulostaTahti);
            saie.run();
        }
    }
}
