package com.company;

public class LeasingUtils {


    public static void KopioiTiedot(Tietokone kone, LeasingTieto tieto, String nimi, String osoite, String sarjanum, String aika) {
        LeasingTieto uusiTieto = new LeasingTieto();;
        uusiTieto.setKayttaja(nimi, osoite);
        uusiTieto.setPaiva(aika);
        Tietokone uusiTietokone = Tietokone.kopioi(kone);
        uusiTietokone.setSarjanum(sarjanum);
        uusiTieto.setuusiTietokone(uusiTietokone);
        System.out.println(uusiTieto);
    }

}
