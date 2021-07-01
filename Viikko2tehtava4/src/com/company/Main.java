package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Korkeakoulu Metroloia = new Korkeakoulu("Metropolia");
        Osoite Matti = new Osoite("Matti", "Meikäläinen", "jkf47f", "Köökarinkuja 7, 00870 Helsinki");
        Metroloia.lisaa_listaan(Matti);
        Osoite Esko = new Osoite("Esko", "Mikälie", "mdg46sr", "Ruotsinpiha 2, 01520 Vantaa");
        Metroloia.lisaa_listaan(Esko);

        Metroloia.tulosta_oppilaat();

    }
}
