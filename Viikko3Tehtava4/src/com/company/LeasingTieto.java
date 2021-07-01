package com.company;

public class LeasingTieto {
    private Kayttaja kayttaja;
    private Tietokone tietokone;
    private String paiva;

    public LeasingTieto() { this.paiva=""; }

    public void setPaiva(String paiva) {
        this.paiva = paiva;
    }

    public void setuusiTietokone(Tietokone tietokone) {
        this.tietokone = tietokone;
    }

    public void setKayttaja(String nimi, String osoite) { this.kayttaja = new Kayttaja(nimi, osoite); }

    @Override
    public String toString() { return this.kayttaja + "\n" + this.tietokone + "\nPäivä: " + this.paiva; }
}
