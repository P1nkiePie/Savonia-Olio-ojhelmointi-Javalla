package com.company;

public class Opiskelija {
    private String nimi;
    private String sukunumi;
    private String opiskelijanumero;

    public Opiskelija() {

    }

    public Opiskelija(String nimi, String sukunimi, String opiskelijanumero) {
        this.nimi=nimi;
        this.sukunumi=sukunimi;
        this.opiskelijanumero=opiskelijanumero;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setSukunimi(String sukunumi) {
        this.sukunumi = sukunumi;
    }

    public void setOpiskelijanumero(String opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public String getNimi() {
        return nimi;
    }

    public String getSukunumi() {
        return sukunumi;
    }

    public String getOpiskelijanumero() {
        return opiskelijanumero;
    }

    @Override
    public String toString() {
        return "Opiskelija: " + nimi + " " + sukunumi + "\nopiskelijanumero: " + opiskelijanumero;
    }
}
