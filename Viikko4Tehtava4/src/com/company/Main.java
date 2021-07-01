package com.company;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.lisaa_listaan(new Tietokone("Asus", "ER443", "212232", 3, 12));
        lista.lisaa_listaan(new Tietokone("Lenovo", "HH544", "3233", 21, 15));
        lista.lisaa_listaan(new Tietokone("Fujitsu", "3323F", "9888", 5, 2));
        lista.lisaa_listaan(new Tietokone("IBM", "IBM3444", "343", 2, 150));

        lista.tulosta_Lista();
    }
}
