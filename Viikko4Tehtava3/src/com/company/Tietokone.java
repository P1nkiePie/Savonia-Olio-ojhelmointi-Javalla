package com.company;

public class Tietokone extends Tuote {
    private String merkki;
    private String malli;

    public Tietokone() {

    }

    public Tietokone(final String merkki, final String malli) {
        this.merkki=merkki;
        this.malli=malli;
    }

    public Tietokone(final String merkki, final String malli, final String tuotenumero) {
        super(tuotenumero);
        this.merkki=merkki;
        this.malli=malli;
    }

    public Tietokone(final String merkki, final String malli, final String tuotenumero, final int maara, final int tuotepaikka) {
        super(tuotenumero, maara, tuotepaikka);
        this.merkki=merkki;
        this.malli=malli;
    }

    public void tulosta_tietokone() {
        System.out.println("Merkki: " + this.merkki + "\nMalli: " + this.malli);
        super.tulosta_tuote();
    }

}
