package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna osake:");
        String osake = lukija.nextLine();
        System.out.print("Anna osinkopros:");
        double prosentti = Double.valueOf(lukija.nextLine());
        System.out.print("Anna sijoitus:");
        int sijoitus = Integer.valueOf(lukija.nextLine());

        System.out.println("Osakkeen " + osake + " tuotto pääomalle " + sijoitus + " on " + (sijoitus/100) * prosentti);
    }
}
