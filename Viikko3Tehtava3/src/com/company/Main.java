package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Opiskelija oppilas = new Opiskelija();

        System.out.print("Anna nimi: ");
        oppilas.setEtunimi(lukija.nextLine());
        System.out.print("Anna sukunimi: ");
        oppilas.setSukunimi(lukija.nextLine());
        System.out.print("Anna opiskelijanumero: ");
        oppilas.setOpiskelijanumero(Integer.valueOf(lukija.nextLine()));
        System.out.print("Anna osoite: ");
        oppilas.setOsoite(lukija.nextLine());
        System.out.println("");

        OpiskelijaUtils.TarkastaTiedot(oppilas);
    }
}
