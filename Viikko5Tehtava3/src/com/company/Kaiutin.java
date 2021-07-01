package com.company;

public class Kaiutin implements ITelephoneSpeaker{
    private int volume;
    private boolean paala;

    public Kaiutin() {
        this.volume=0;
        this.paala = false;
    }

    @Override
    public boolean mute() {
        this.paala=false;
        return true;
    }

    @Override
    public boolean unMute() {
        this.paala=true;
        return true;
    }

    @Override
    public void setVolume() {
        this.volume++;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
