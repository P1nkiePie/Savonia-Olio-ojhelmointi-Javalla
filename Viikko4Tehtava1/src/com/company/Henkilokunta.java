package com.company;

public class Henkilokunta extends Henkilo{
    private String tyontekijanumero;
    private String toimipaikka;
    private String titteli;

    public Henkilokunta(String nimi, String osoite, String syntyma_aika, String num, String toim, String titteli) {
        super(nimi, osoite, syntyma_aika);
        this.tyontekijanumero=num;
        this.toimipaikka=toim;
        this.titteli=titteli;
    }

    public void tulostaHenkilokunta() {
        super.getHenkilonTiedot();
        System.out.println("Työntekijänumero: " + this.tyontekijanumero +
                "\nToimipaikka: " + this.toimipaikka +
                "\nTitteli: " + this.titteli);
    }
}
