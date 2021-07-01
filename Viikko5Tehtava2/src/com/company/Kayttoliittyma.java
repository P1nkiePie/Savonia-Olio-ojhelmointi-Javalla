package com.company;
import java.util.Scanner;

public class Kayttoliittyma implements OmatJaYhteisetTilit{
    Scanner lukija = new Scanner(System.in);

    public void kaynnista() {
        System.out.print("Omistajan nimi: ");
        OmatJaYhteisetTilit.omatili.setOmistaja(lukija.nextLine());
        System.out.print("Tilinumero: ");
        OmatJaYhteisetTilit.omatili.setTilinum(lukija.nextLine());
        System.out.print("Saldo: ");
        OmatJaYhteisetTilit.omatili.setSaldo(Double.valueOf(lukija.nextLine()));
        System.out.print("Korkoprosentti: ");
        OmatJaYhteisetTilit.omatili.setVuosikorko(Double.valueOf(lukija.nextLine()));
        System.out.println("");

        System.out.print("Omistajien nimet(erota nimet pilkulla): ");
        OmatJaYhteisetTilit.yhteinentili.setOmistaja(lukija.nextLine());
        System.out.print("Tilinumero: ");
        OmatJaYhteisetTilit.yhteinentili.setTilinum(lukija.nextLine());
        System.out.print("Saldo: ");
        OmatJaYhteisetTilit.yhteinentili.setSaldo(Double.valueOf(lukija.nextLine()));
        System.out.print("Korkoprosentti: ");
        OmatJaYhteisetTilit.yhteinentili.setVuosikorko(Double.valueOf(lukija.nextLine()));
        System.out.println("");

        System.out.println(omatili);
        System.out.println("---");
        System.out.println(yhteinentili);
    }
}
