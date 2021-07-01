package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Kayttaja kayttaja = new Kayttaja();
        LeasingTieto tieto = new LeasingTieto();
        Tietokone tietokone = new Tietokone();

        System.out.print("Nimi: ");
        kayttaja.setNimi(lukija.nextLine());
        System.out.print("Osoite: ");
        kayttaja.setOsoite(lukija.nextLine());

        System.out.print("Merkki: ");
        String merkki = lukija.nextLine();
        System.out.print("Malli: ");
        String malli = lukija.nextLine();
        tietokone.setMerkki(merkki);
        tietokone.setMalli(malli);

        System.out.print("Sarjanumero: ");
        tietokone.setSarjanum(lukija.nextLine());

        System.out.print("Päivä: ");
        tieto.setPaiva(lukija.nextLine());

        while (true) {
            System.out.print("Lisätäänkö leasing (k/e)? ");
            String valinta = lukija.nextLine();
            if (valinta.equals("e")) {
                break;
            } else if (valinta.equals("k")) {
                System.out.print("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.print("Osoite: ");
                String osoite = lukija.nextLine();
                System.out.print("Sarjanum: ");
                String sarjanum = lukija.nextLine();
                System.out.print("Päivä: ");
                String paiva = lukija.nextLine();
                LeasingUtils.KopioiTiedot(tietokone, tieto, nimi, osoite, sarjanum, paiva);
            }
        }
    }

}
