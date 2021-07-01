package com.company;

public class Main {

    public static void main(String[] args) {
	 Tietokone eka = new Tietokone("asus", "rog", "18376", 5, 22);
	 Tietokone toka = new Tietokone("msi", "evoke oc", "8473252", 12, 3);
	 eka.tulosta_tietokone();
	 System.out.println("---");
	 toka.tulosta_tietokone();
    }
}
