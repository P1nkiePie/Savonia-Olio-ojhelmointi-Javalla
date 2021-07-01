package com.company;
import java.util.*;

public class Auto {
    private String reknum;
    private String merkki;
    private int vuosimalli;
    private String malli;
    private Scanner lukija;

    public Auto(Scanner lukja) {
        this.merkki=this.merkki;
        this.malli=this.malli;
        this.vuosimalli=0;
        this.reknum="unknown";
        this.lukija=lukija;
    }

    public Auto(String reknum) {
    }

    public Auto(int vuosi) {

        this.vuosimalli=1900;
    }

    public String getReknum() {
        return this.reknum;
    }

    public String getMerkki() {
        return this.merkki;
    }

    public int getVuosimalli() {
        return this.vuosimalli;
    }

    public String getMalli() {
        return this.malli;
    }

    public void setReknum(String uusi_reknum) {
            try {
                String[] palat = uusi_reknum.split("-");
                String kirjaimet = palat[0];
                int[] numerot = new int[Integer.parseInt(palat[1])];

                if (palat[0].length() != 3) {
                    this.reknum = "unknown";
                } else if (palat[1].length() != 3) {
                    this.reknum = "unknown";
                } else if (!uusi_reknum.contains("-")) {
                    this.reknum = "unknown";
                } else {
                    this.reknum = uusi_reknum;
                }

            } catch (Exception e) {
                System.out.println("Virhe: " + e);
            }
    }

    public void setMerkki(String uusi_merkki) {
        this.merkki=uusi_merkki;
    }

    public void setVuosimalli(int uusi_vuosimalli) {
        if (uusi_vuosimalli <= 1900 || uusi_vuosimalli > 2021) {
            this.vuosimalli = 1900;
        } else {
            this.vuosimalli = uusi_vuosimalli;
        }
    }

    public void setMalli(String uusi_malli) {
        this.malli=uusi_malli;
    }

    public void kysyTiedot(Scanner lukija) {
        System.out.print("Anna rekisterinumero: ");
        this.setReknum(lukija.nextLine());
        System.out.print("Anna markki: ");
        this.setMerkki(lukija.nextLine());
        System.out.print("Anna malli: ");
        this.setMalli(lukija.nextLine());
        System.out.print("Anna valmistus vuosi: ");
        this.setVuosimalli(Integer.valueOf(lukija.nextLine()));
    }

    @Override
    public String toString() {
        return "reknum = " + reknum + "\n" +
                "merkki = " + merkki + "\n" +
                "vuosimalli = " + vuosimalli + "\n" +
                "malli = " + malli;
    }
}
