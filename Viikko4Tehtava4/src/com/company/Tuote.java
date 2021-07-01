package com.company;

public class Tuote {
    private String Tuotenumero;
    private int tuotepaikka;
    private int maara;

    public Tuote() {

    }

    public Tuote(final String tuotenumero) {
        this.Tuotenumero=tuotenumero;
    }

    public Tuote(final String tuotenumero, final int maara, final int tuotepaikka) {
        this.Tuotenumero=tuotenumero;
        this.maara=maara;
        this.tuotepaikka=tuotepaikka;
    }

    public int getTuotepaikka() {
        return tuotepaikka;
    }

    public void setTuotepaikka(int tuotepaikka) {
        this.tuotepaikka = tuotepaikka;
    }

    @Override
    public String toString() {
        return "Tuotenumero: " + this.Tuotenumero + "\nTuotepaikka: " + this.tuotepaikka + "\nMäärä: " + this.maara;
    }
}
