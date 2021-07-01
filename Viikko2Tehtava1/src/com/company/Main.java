package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Korkeakoulu koulu = new Korkeakoulu("Metropolia");
        Opiskelija matti = new Opiskelija("Matti", "Meikäläinen", "jh234g", "Ruotsinpiha 2 , 00840 Helsinki");
        koulu.lisaa_opiskelija(matti);
        Opiskelija esko = new Opiskelija("Esko", "Ukkonen", "hutdk36", "Mannerheimintie 15, 00100 Helsinki");
        koulu.lisaa_opiskelija(esko);
        koulu.tulosta_opiskelijat();
    }
}
