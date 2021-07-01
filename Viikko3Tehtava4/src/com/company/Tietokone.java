package com.company;

public class Tietokone {
    private String merkki;
    private String malli;
    private String sarjanum;

    public String getMalli() {

        return malli;
    }

    public String getMerkki() {

        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public void setMalli(String malli) {

        this.malli = malli;
    }

    public void setSarjanum(String sarjanum) {

        this.sarjanum = sarjanum;
    }


    @Override
    public String toString() {
        return "Merkki: " + this.merkki + "\nMalli: " + this.malli + "\nSarjanumero: " + this.sarjanum;
    }

    public static Tietokone kopioi(Tietokone tietokone){

        Tietokone t = new Tietokone();
        t.setMerkki(tietokone.getMerkki());
        t.setMalli(tietokone.getMalli());

        return t;

    }

}
