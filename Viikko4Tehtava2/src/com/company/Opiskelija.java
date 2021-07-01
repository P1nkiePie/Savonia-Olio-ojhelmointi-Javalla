package com.company;

public class Opiskelija extends Henkilo{
    private int opiskelijanum;
    private String aloituspaiva;

    public Opiskelija(String nimi, String osoite, String syntyma_aika, int num, String paiva) {
        super(nimi, osoite, syntyma_aika);
        this.opiskelijanum=num;
        this.aloituspaiva=paiva;
    }

    public void tulostaOpiskelija() {
        super.getHenkilonTiedot();
        System.out.println("Opiskelijanumero: " + this.opiskelijanum);
        System.out.println("Aloitus päivä: " + this.aloituspaiva);
        System.out.println("---");
    }
}
