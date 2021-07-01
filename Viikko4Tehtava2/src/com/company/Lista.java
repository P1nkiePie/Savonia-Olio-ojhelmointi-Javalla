package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Lista {
    private ArrayList<Object> lista;

    public Lista() {
        this.lista = new ArrayList<>();
    }

    public void lisaa_listaan(Object lisattava) {
        this.lista.add(lisattava);
    }

    public void tulosta_lista() {
        for (Object tulostettava: this.lista) {
            if (tulostettava instanceof Opiskelija) {
                final Opiskelija op = (Opiskelija) tulostettava;
                op.tulostaOpiskelija();
            }
        }
        for (Object o: this.lista) {
            if (o instanceof Henkilokunta) {
                final Henkilokunta hk = (Henkilokunta) o;
                hk.tulostaHenkilokunta();
            }
        }
    }
}


