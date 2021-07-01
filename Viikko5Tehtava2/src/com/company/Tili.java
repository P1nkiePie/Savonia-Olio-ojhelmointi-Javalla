package com.company;

public abstract class Tili {
    private String Tilinum;
    private String omistaja;
    private double saldo;
    private double Vuosikorkoprosentti;

    public void setTilinum(String tilinum) {
        this.Tilinum = tilinum;
    }

    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setVuosikorko(double vuosikorko) {
        if (vuosikorko < 0) {
            throw new ArithmeticException("Virheellinen prosenttiluku!");
        }
        this.Vuosikorkoprosentti = vuosikorko;
    }

    public String getTilinum() {
        return Tilinum;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getVuosikorko() {
        return Vuosikorkoprosentti;
    }

    public double laskeVuosiKorkotuotto() {
        return this.saldo * this.Vuosikorkoprosentti / 100;
    }

    public String toString() {
        return this.omistaja + "\n" + this.Tilinum + "\n"
                + "Saldo: " + this.saldo + "\n" + "Vuosikorko annetulla prosentilla: " +this.laskeVuosiKorkotuotto();
    }
}
