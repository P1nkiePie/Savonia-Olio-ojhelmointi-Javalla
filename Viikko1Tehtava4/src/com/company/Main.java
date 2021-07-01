package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Lottorivi rivi = new Lottorivi();
        ArrayList<Integer> numerot = rivi.rivi();

        System.out.print("Lottonumerot ovat: ");
        for (Integer numero: numerot) {
            System.out.print(numero + " ");
        }
        System.out.println("");
        while (true) {
            System.out.print("Haluatko arpoa rivin (k=kyllä, e=ei)?");
            String valinta = lukija.nextLine();
            if (valinta.equals("e")) break;
            if (valinta.equals("k")) {
                Lottorivi omarivi = new Lottorivi();
                ArrayList<Integer> omatNumerot = omarivi.rivi();
                System.out.print("Ohjelma arpoi: ");
                for (Integer numero : omatNumerot) {
                    System.out.print(numero + " ");
                }
                System.out.println("");
                ArrayList<Integer> samat = new ArrayList<>();
                for (int i = 0; i < omatNumerot.size(); i++) {
                    if (numerot.contains(omatNumerot.get(i))) {
                        samat.add(omatNumerot.get(i));
                    }
                }
                System.out.print("Okein oli " + samat.size() + "kpl, jotka olivat: ");
                samat.stream().sorted().forEach(numero -> System.out.print(numero + " "));
                System.out.println("");
            }
        }
    }
}
