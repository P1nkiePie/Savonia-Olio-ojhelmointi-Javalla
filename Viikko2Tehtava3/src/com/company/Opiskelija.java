package com.company;

import java.util.ArrayList;

public class Opiskelija {
    private String nimi;
    private int tehtavapisteet;
    private int koepisteet;
    ArrayList<String> lista;

    public Opiskelija(String nimi, int tehtavapisteet, int koepisteet) {
        this.nimi = nimi;
        this.tehtavapisteet=tehtavapisteet;
        this.koepisteet=koepisteet;
        this.lista=new ArrayList<>();
    }

    public String getNimi() {
        return this.nimi;
    }

    public int get_tehtavapisteet() {
        return this.tehtavapisteet;
    }

    public int get_koepisteet() {
        return this.koepisteet;
    }

    public double arvosana() {
        double arvosana=0;
        if (this.koepisteet<10) arvosana=0;
        else if (this.koepisteet<12) arvosana=1;
        else if (this.koepisteet<14) arvosana=2;
        else if (this.koepisteet<16) arvosana=3;
        else if (this.koepisteet<18) arvosana=4;
        else arvosana=5;
        if (arvosana>0 && ((double) tehtavapisteet/16)>=0.75) arvosana++;
        if (arvosana>5) arvosana=5;
        return arvosana;
    }

    public String toString() {
        return "Nimi: " + this.nimi + " Tehtavien pisteet: " + this.tehtavapisteet + " Koe pisteet: " + this.koepisteet
                + " Arvosana: " + this.arvosana();
    }


}
