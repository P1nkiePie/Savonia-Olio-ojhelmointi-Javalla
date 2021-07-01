package com.company;

public class Osake {
    private String nimi;
    private int ostohinta;
    private double korkoprosentti;
    private int vuodet;

    public Osake(String nimi, int paaoma) {
    this.nimi=nimi;
    this.ostohinta=paaoma;
    }

    public String getNimi() {
        return nimi;
    }

    public int getOstohinta() {
        return ostohinta;
    }

    public void anna_arvot(double prosentti, int vuodet) {
        double tuotto=0;
        if (prosentti<10) {
            this.korkoprosentti=0.1*prosentti;
        } else this.korkoprosentti=prosentti;
        this.vuodet=vuodet;
        int kokonaistuotto=200;
        for (int i=0; i<vuodet; i++) {
            kokonaistuotto+=this.LaskeTuottoYhdelleVuodelle();
        }
        System.out.println("Vuosikohtainen tuotto: " + this.LaskeTuottoYhdelleVuodelle());
        System.out.println("Tuotto " + this.vuodet + " vuodelle: " + (kokonaistuotto-200));
        System.out.println("Osakkeen " + this.nimi + " arvo " + this.vuodet + " vuoden jälkeen: " + kokonaistuotto + "\n");
    }

    private double LaskeTuottoYhdelleVuodelle() {
        int erotus=0;
        for (int i=0; i<this.vuodet; i++) {
            erotus += this.ostohinta*this.korkoprosentti;
        }
    return erotus/this.vuodet;
    }

    @Override
    public String toString() {
        return "Osake: " + nimi + "\nostohinta=" + ostohinta + "\n";
    }
}
