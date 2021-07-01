package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Lista lista = new Lista();

        while (true) {
            System.out.print("Syötetäänkö uusi henkilö (k/e): ");
            String valinta = lukija.nextLine();
            System.out.println("");
            if (valinta.equals("e")) break;
            if (valinta.equals("k")) {
                System.out.println("1: Opiskelija");
                System.out.println("2: Henkilökunta");
                int syote = Integer.valueOf(lukija.nextLine());

                switch (syote) {
                    case 1:
                        System.out.print("Nimi: ");
                        String nimi = lukija.nextLine();
                        System.out.print("Osoite: ");
                        String osoite = lukija.nextLine();
                        System.out.print("Syntymäaika: ");
                        String synaika = lukija.nextLine();
                        System.out.print("Opiskelijanumero: ");
                        int opnum = Integer.valueOf(lukija.nextLine());
                        System.out.print("Aloitus päivä: ");
                        String paiva = lukija.nextLine();
                        System.out.println("");
                        Opiskelija opiskelija = new Opiskelija(nimi,osoite,synaika,opnum,paiva);
                        lista.lisaa_listaan(opiskelija);
                        break;

                    case 2:
                        System.out.print("Nimi: ");
                        nimi = lukija.nextLine();
                        System.out.print("Osoite: ");
                        osoite = lukija.nextLine();
                        System.out.print("Syntymäaika: ");
                        synaika = lukija.nextLine();
                        System.out.print("Työntekijänumero: ");
                        String tyonum = lukija.nextLine();
                        System.out.print("Toimipaikka: ");
                        String paikka = lukija.nextLine();
                        System.out.print("Titteli: ");
                        String titteli = lukija.nextLine();
                        System.out.println("");
                        Henkilokunta henkilokunta = new Henkilokunta(nimi, osoite, synaika, tyonum, paikka, titteli);
                        lista.lisaa_listaan(henkilokunta);
                        break;
                }
            }
        }
        lista.tulosta_lista();
    }
}
