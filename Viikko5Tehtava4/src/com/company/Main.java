package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner lukija = new Scanner(System.in);
    	Puhelin puhelin = new Puhelin();
    	ITelephoneSpeaker qualcomm = new QualcommKaiutin();
    	ITelephoneSpeaker broadcom = new BroadcomKaiutin();
    	ITelephoneMic broadcomMic = new BroadcomMikrofoni();
    	ITelephoneMic samsungMic = new SamsungMikrofoni();

		System.out.println("Valitse kaiutin");
		System.out.println("1: Qualcomm\n" + "2: Broadcom");
		int valinta = Integer.valueOf(lukija.nextLine());

		switch (valinta) {
			case 1:
				puhelin.setKaiutin(qualcomm);
				break;
			case 2:
				puhelin.setKaiutin(broadcom);
		}
		System.out.println(" ");

		System.out.println("Valitse Mikrofoni");
		System.out.println("1: Broadcom\n" + "2: Samsung");
		valinta = Integer.valueOf(lukija.nextLine());

		switch (valinta) {
			case 1:
				puhelin.setMikrofoni(broadcomMic);
				break;
			case 2:
				puhelin.setMikrofoni(samsungMic);
		}
		System.out.println(" ");

		while (true) {
			System.out.println("0: Lopettaa");
			System.out.println("1: Aseta kaiuttimen äänenvoimakkuus");
			System.out.println("2: Vaimenna");
			System.out.println("3: Poista vaimennus");
			System.out.println("4: lisää äänenvoimakkuutta");
			valinta = Integer.valueOf(lukija.nextLine());
			if (valinta==0) break;
			switch (valinta) {
				case 1:
					System.out.println("Aseta äänenvoimakkuus 1-" + puhelin.getKaiutin().getMax() + ": ");
					puhelin.getKaiutin().lisaaVolume(Integer.valueOf(lukija.nextLine())); continue;
				case 2:
					puhelin.getKaiutin().mute();
					System.out.println("Kaiutin äänettömällä");
					continue;
				case 3:
					puhelin.getKaiutin().unMute();
					System.out.println("Kaiuttimen äänet päällä\nÄänenvoimakkuus: " + puhelin.getKaiutin().getVolume());
					continue;
				case 4:
					puhelin.getKaiutin().setVolume();
					System.out.println("Äänenvoimakkuus: " + puhelin.getKaiutin().getVolume());
			}
		}

		while (true) {
			System.out.println("0: Lopettaa");
			System.out.println("1: Lisää Mikrofonin äänenvoimakkuutta");
			System.out.println("2: Sammuta");
			System.out.println("3: Laita päälle");

			valinta = Integer.valueOf(lukija.nextLine());
			if (valinta==0) break;
			switch (valinta) {
				case 1:
					puhelin.getMikrofoni().setVolume();
					System.out.println("Mikrofonin äänenvoimakkuus: " + puhelin.getMikrofoni().getVolume());
					continue;
				case 2:
					puhelin.getMikrofoni().micOff();
					System.out.println("Mikrofoni pois päältä");
					continue;
				case 3:
					puhelin.getMikrofoni().micOn();
					System.out.println("Mikrofoni päällä\nÄänenvoimakkuus: " + puhelin.getMikrofoni().getVolume());
			}
		}
    }

}
