package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner lukija = new Scanner(System.in);

        double summa=0;
        int maara=0;
        int suurin=0;

        int luku = 1;
        for(int i=0; i<12; i++) {
            System.out.print("Anna " + luku + ".kuukauden tulo: ");
            int tulo = Integer.valueOf(lukija.nextLine());
            summa += tulo;
            maara++;
            if (tulo > suurin) {
                suurin = tulo;
            }
            luku++;
        }
        System.out.println("\nKokonaistulot ovat " + summa);
        System.out.println("Keskiarvoinen kuukausikohtainen tulo on " + 1.0*summa/maara);
        System.out.println("Suurin kuukausikohtainen tulo on " + suurin);

    }
}
