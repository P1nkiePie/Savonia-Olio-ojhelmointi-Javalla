package com.company;

public class Saastotili extends Tili {

    @Override
    public double laskeVuosiKorkotuotto() {
        return super.laskeVuosiKorkotuotto();
    }

    @Override
    public String toString() {

        return this.getOmistaja() + "\n" + this.getTilinum()
                + "\nSäästötilin saldo: " + this.getSaldo()
                + "\nVuosikorko annetulla prosentilla: " + this.laskeVuosiKorkotuotto();
    }
}
