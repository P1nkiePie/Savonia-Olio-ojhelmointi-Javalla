package com.company;

public class Henkilo {
    private String nimi;
    private String osoite;
    private String syntyma_aika;

    public Henkilo(String nimi, String osoite, String syntyma_aika) {
        this.nimi=nimi;
        this.osoite=osoite;
        this.syntyma_aika=syntyma_aika;
    }

    public void getHenkilonTiedot() {
        System.out.println(this.nimi + ", " + this.syntyma_aika + ", " + this.osoite);
    }
}
