package com.company;

public class Main {

    public static void main(String[] args) {

		Saastotili saastotili = new Saastotili();
		saastotili.setOmistaja("Pekka Miettinen");
		saastotili.setTilinum("FI09 3474 2876 8274 82");
		saastotili.setVuosikorko(4.5);
		saastotili.setSaldo(500);
		System.out.println(saastotili);

		System.out.println("---");

		SuperSaastoTili superSaastoTili = new SuperSaastoTili();
		superSaastoTili.setOmistaja("Jaska Jokunen");
		superSaastoTili.setTilinum("FI09 5441 8972 3845 91");
		superSaastoTili.setSaldo(10000);
		superSaastoTili.setVuosikorko(6.7);
		superSaastoTili.laskeVuosiKorkotuotto();
		System.out.println(superSaastoTili);

		System.out.println("---");

		saastotili.setSaldo(550);
		System.out.println(saastotili);

		System.out.println("---");

		superSaastoTili.setSaldo(10001);
		superSaastoTili.setVuosikorko(5.5);
		System.out.println(superSaastoTili);

		System.out.println("---");

		superSaastoTili.setSaldo(10000);
		superSaastoTili.laskeVuosiKorkotuotto();
		System.out.println(superSaastoTili);
    }
}
