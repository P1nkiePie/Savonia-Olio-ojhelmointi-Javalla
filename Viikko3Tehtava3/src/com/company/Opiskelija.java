package com.company;

public class Opiskelija {
    private String etunimi;
    private String sukunimi;
    private int opiskelijanumero;
    private String osoite;

    public Opiskelija() {
    }

    public String getEtunimi() {
        return this.etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public Integer getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public String getOsoite() {
        return osoite;
    }
    public boolean Onkonimi() {
        if (this.getEtunimi()==null) {
            return false;
        }
        return true;
    }

    public void setEtunimi(String etunimi) {
        if (etunimi.charAt(0) == (etunimi.toUpperCase().charAt(0)));
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        if (sukunimi.charAt(0) == (sukunimi.toUpperCase().charAt(0)));
        this.sukunimi = sukunimi;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public String toString() {
        return "Nimi: " + this.etunimi + "\nSukunimi: " + this.sukunimi
                + "\nOpiskelijanumero: " + this.opiskelijanumero + "\nOsoite: " + this.osoite;
    }
}
