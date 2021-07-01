package com.company;

import java.util.ArrayList;

public class MathUtils {

    public static void LaskeYhteen(ArrayList<Double> lista) {
        double summa=0;
        for(int i=0; i<lista.size(); i++) {
            summa+=lista.get(i);
        }
        System.out.println("Listan lukujen summa: " + summa);
    }

    public static void SuurinLuku(ArrayList<Double> lista) {
        double suurin = 0;
        for (int i=0; i< lista.size(); i++) {
            if(lista.get(i)>suurin) {
                suurin= lista.get(i);
            }
        }
        System.out.println("Listan suurin luku: " + suurin);
    }

    public static void LaskeKeskiarvo(ArrayList<Double> lista) {
        double keskiarvo=0;
        double summa=0;
        for (int i=0; i< lista.size(); i++) {
            summa+=lista.get(i);
        }
        System.out.println("Listan lukujen keskiarvo: " + 1.0*summa/lista.size());
    }
}
