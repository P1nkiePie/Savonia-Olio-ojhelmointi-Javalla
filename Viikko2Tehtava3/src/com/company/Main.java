package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner lukija = new Scanner(System.in);
	Lista lista = new Lista();

        for (int i=0; i<3; i++) {
            System.out.print("Anna nimi: ");
            String nimi= lukija.nextLine();
                System.out.print("Anna tehtävien piseet (0-16): ");
                int tehtavapisteet = Integer.valueOf(lukija.nextLine());
                System.out.print("Anna koe pisteet (0-20): ");
                int koepisteet = Integer.valueOf(lukija.nextLine());

                Opiskelija oppilas = new Opiskelija(nimi, tehtavapisteet, koepisteet);
                lista.lisaa_listaan(oppilas);
        }
        lista.tulosta_lista();

    }
}
