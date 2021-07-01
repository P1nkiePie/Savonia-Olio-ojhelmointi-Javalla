package com.company;

import java.util.ArrayList;

public class Korkeakoulu {
    private String nimi;
    private ArrayList<Opiskelija> oppilas_lista;

    public Korkeakoulu(String nimi) {
        this.nimi=nimi;
        this.oppilas_lista=new ArrayList<>();
    }

    public void lisaa_listaan(Osoite oppilas) {
        oppilas_lista.add(oppilas);
    }

    public void tulosta_oppilaat() {
        for(Opiskelija oppilas: oppilas_lista) {
            System.out.println(oppilas);
        }
    }
}
