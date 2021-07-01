package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
	// write your code here
        Auto vw = new Auto(lukija);
        Auto uusiauto = new Auto(lukija);
        vw.setReknum("cjv-590");
        vw.setVuosimalli(2011);
        vw.setMalli("Passat");
        vw.setMerkki("Volkswagen");

        System.out.println(vw);
        System.out.println("");

        uusiauto.kysyTiedot(lukija);
        System.out.println("");
        System.out.println(uusiauto);
    }
}
