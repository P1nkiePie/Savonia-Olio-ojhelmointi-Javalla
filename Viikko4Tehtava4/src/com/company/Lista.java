package com.company;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Tietokone> lista;

    public Lista() {
        this.lista=new ArrayList<>();
    }

    public void lisaa_listaan(Tietokone tietokone) {
        lista.add(tietokone);
    }

    public void tulosta_Lista() {
        for (Tietokone t: this.lista) {
            System.out.println(t);
        }
    }
}
