package com.company;

public class Kayttaja {
    private String nimi;
    private String osoite;

    public Kayttaja() {
        this.nimi="";
        this.osoite="";
    }

    public  Kayttaja(String nimi, String osoite) {
        this.nimi=nimi;
        this.osoite=osoite;
    }

    public void setNimi(String nimi) {

        this.nimi = nimi;
    }

    public void setOsoite(String osoite) {

        this.osoite = osoite;
    }

    @Override
    public String toString() {

        return "Käyttäjä: " + this.nimi + "\n" + "Osoite: " +this.osoite;
    }
}
