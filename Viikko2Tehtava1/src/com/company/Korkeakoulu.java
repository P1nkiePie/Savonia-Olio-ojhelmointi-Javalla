package com.company;

import java.util.ArrayList;

public class Korkeakoulu {
    private String oppilaitos;
    private ArrayList<Opiskelija> opiskelijat;

    public Korkeakoulu(String nimi) {
        this.oppilaitos = nimi;
        this.opiskelijat = new ArrayList<>();
    }

    public void lisaa_opiskelija(Opiskelija oppilas) {
        this.opiskelijat.add(oppilas);
    }

    public void tulosta_opiskelijat() {
        opiskelijat.stream().forEach(luettu -> System.out.println(luettu));
    }
}
