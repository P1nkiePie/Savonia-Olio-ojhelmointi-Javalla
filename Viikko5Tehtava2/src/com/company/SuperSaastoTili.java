package com.company;

public class SuperSaastoTili extends Tili{

    @Override
    public double laskeVuosiKorkotuotto() {
        if (this.getSaldo()>10000) {
            return this.getSaldo() * (this.getVuosikorko() + 3.0)/ 100;
        } else {
            return super.laskeVuosiKorkotuotto();
        }
    }

    @Override
    public String toString() {
        return this.getOmistaja() + "\n" + this.getTilinum() + "\nSupersäästötilin saldo: " + this.getSaldo()
                + "\nVuosikorko annetulla prosentilla: " + this.laskeVuosiKorkotuotto();
    }
}
