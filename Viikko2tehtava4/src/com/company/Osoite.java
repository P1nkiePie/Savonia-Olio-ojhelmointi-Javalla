package com.company;

public class Osoite extends Opiskelija{
    private String osoite;

    public Osoite(String nimi, String sukunimi, String opiskelijanumero, String osoite) {
        super(nimi, sukunimi, opiskelijanumero);
        this.osoite=osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String getOsoite() {
        return osoite;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" + "Osoite: " + osoite + "\n";
    }
}
