package com.company;

public class Tietokone extends Tuote{
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
        if (super.getTuotepaikka()<10) {
            super.setTuotepaikka(super.getTuotepaikka()+10);
        } else if (super.getTuotepaikka() >= 10 && super.getTuotepaikka() <= 100) {
            super.setTuotepaikka(super.getTuotepaikka()+30);
        } else if (super.getTuotepaikka() > 100) {
            super.setTuotepaikka(super.getTuotepaikka()+500);
        }
        this.merkki=merkki;
        this.malli=malli;
    }

    @Override
    public String toString() {
        return "Merkki: " + this.merkki + "\nMalli: " + this.malli + "\n" + super.toString() + "\n---";
    }
}
