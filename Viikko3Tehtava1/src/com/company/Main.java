package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Osake> osakkeet = new ArrayList<>();
        while (true) {
            System.out.print("Lisätäänkö uusi osake (k=kyllä, e=ei)?: ");
            String syote = lukija.nextLine();
            if (syote.equals("e")) break;
            else if (syote.equals("k")) {
                System.out.print("Anna osakkeen nimi: ");
                String nimi = lukija.nextLine();
                System.out.print("Anna sijoitettu pääoma: ");
                int paaoma = Integer.valueOf(lukija.nextLine());
                System.out.println("");
                osakkeet.add(new Osake(nimi, paaoma));
            }
        }
        System.out.println("");
        for(Osake osake: osakkeet) {
            System.out.println(osake);
        }
        int i=0;
        while (i<osakkeet.size()) {
            System.out.print("Anna osakkeelle " + osakkeet.get(i).getNimi() + " kasvuprosentti: ");
            double prosentti = Double.valueOf(lukija.nextLine());
            System.out.print("Anna ajanjakso vuosina: ");
            int vuodet = Integer.valueOf(lukija.nextLine());
            osakkeet.get(i).anna_arvot(prosentti, vuodet);

            i++;
        }

    }
}
