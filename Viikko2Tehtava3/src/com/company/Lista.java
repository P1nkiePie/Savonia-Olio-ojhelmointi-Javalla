package com.company;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Opiskelija> lista;

    public Lista() {
        this.lista=new ArrayList<>();
    }

    public void lisaa_listaan(Opiskelija oppilas) {
        this.lista.add(oppilas);
    }

    public void tulosta_lista() {
        for(Opiskelija oppilas: lista) {
            System.out.println(oppilas);
        }
    }

}
