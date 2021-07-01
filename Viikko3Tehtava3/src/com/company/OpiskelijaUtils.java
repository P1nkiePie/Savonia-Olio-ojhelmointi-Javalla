package com.company;

import java.io.OutputStream;

public class OpiskelijaUtils {

    public static boolean TarkastaTiedot(Opiskelija oppilas) {
        if (oppilas.getEtunimi()!=null) {
            String s1 = oppilas.getEtunimi().substring(0, 1).toUpperCase();
            String nimiIsolla = s1 + oppilas.getEtunimi().substring(1);
                System.out.println("Nimi: " + nimiIsolla);
        } else System.out.println("Nimi: " + null);
        if (oppilas.getSukunimi()!=null) {
            String s1 = oppilas.getSukunimi().substring(0, 1).toUpperCase();
            String sukunimiIsolla = s1 + oppilas.getSukunimi().substring(1);
            System.out.println("Sukunimi: " + sukunimiIsolla);
        } else System.out.println("Sukunimi: " + null);
        System.out.println("Opiskelijanumero: " + oppilas.getOpiskelijanumero());
        if (oppilas.getOsoite()!=null) {
            System.out.println("Osoite: " + oppilas.getOsoite());
        } else System.out.println("Osoite: " + null);

        return false;
    }
}
