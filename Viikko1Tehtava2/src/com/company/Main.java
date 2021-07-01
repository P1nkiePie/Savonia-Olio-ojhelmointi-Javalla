package com.company;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

		System.out.print("Anna korkeus: ");
		int korkeus = Integer.valueOf(lukija.nextLine());
		System.out.print("Anna leveys: ");
		int leveys = Integer.valueOf(lukija.nextLine());
		System.out.print("Anna piirtomerkki: ");
		String merkki = lukija.nextLine();
		System.out.print("Täytetty vai ei (k=kyllä, e=ei): ");
		String valinta = lukija.nextLine();

		if (valinta.equals("k")) {
			for (int i = 0; i < korkeus; i++) {
				for (int l = 0; l < leveys; l++) {
					System.out.print(merkki);
				}
				System.out.println("");
			}
		}
		if (valinta.equals("e")) {
			for (int i = 0; i < korkeus; i++) {
					int tyhjat = 4;
					if (i == 0 || i == korkeus - 1) {
						for (int p = 0; p < leveys; p++) {
							System.out.print(merkki);
						}
					} else {
						for (int p=0; p<leveys; p++) {
							System.out.print(merkki);
							if (p==0) {
								for (int t=0; t<=tyhjat; t++) {
									System.out.print(" ");
									p++;
								}
							System.out.print(merkki);
							}
						}
					}
				System.out.println("");
			}
		}
	}
}
