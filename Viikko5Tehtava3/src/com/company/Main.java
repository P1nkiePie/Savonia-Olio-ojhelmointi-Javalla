package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephoneMic mic = new Mikrofoni();
	mic.micOn();
	mic.micOff();
	mic.setVolume();
	System.out.println(mic.getVolume());
	ITelephoneSpeaker kaiutin = new Kaiutin();
	kaiutin.mute();
	kaiutin.setVolume();
	kaiutin.unMute();
	System.out.println(kaiutin.getVolume());
    }
}
