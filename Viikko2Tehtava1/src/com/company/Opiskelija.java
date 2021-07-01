package com.company;
import java.util.*;

public class Opiskelija {
    private String nimi;
    private String sukunumi;
    private String opiskelijanumero;
    private String osoite;

    public Opiskelija(String nimi, String sukunumi, String opiskelijanumero, String osoite) {
        this.nimi=nimi;
        this.sukunumi=sukunumi;
        this.opiskelijanumero=opiskelijanumero;
        this.osoite=osoite;
    }

    public String getNimi() {
        return this.nimi;
    }

    public String getSukunumi() {
        return this.sukunumi;
    }

    public String getOpiskelijanumero() {
        return this.opiskelijanumero;
    }

    public String getOsoite() {
        return this.osoite;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setOpiskelijanumero(String opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public void setSukunumi(String sukunumi) {
        this.sukunumi = sukunumi;
    }

    public String toString() {
        return "Opiskelija: " + nimi + " " + sukunumi + " \n" + "Opiskelijanumero: " + opiskelijanumero + " \n" + osoite + "\n";
    }
}
