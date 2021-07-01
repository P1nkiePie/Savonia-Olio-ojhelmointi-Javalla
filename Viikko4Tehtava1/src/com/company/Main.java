package com.company;

public class Main {

    public static void main(String[] args) {
        Opiskelija opiskelija = new Opiskelija("Pekka", "Helsinki", "02.08.2001", 123, "01.08.2019");
        Henkilokunta opettaja = new Henkilokunta("Liisa", "Helsinki", "23.02.1987", "321", "Helsinki", "Opettaja");
        opiskelija.tulostaOpiskelija();
        System.out.println("---");
        opettaja.tulostaHenkilokunta();
    }
}
