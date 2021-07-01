package com.company;

public class BroadcomKaiutin implements ITelephoneSpeaker{
    private int volume;
    private boolean paalla;
    private int max;

    public BroadcomKaiutin() {
        this.paalla=false;
        this.volume=0;
        this.max=100;
    }

    @Override
    public boolean onkoPaalla() {
        return this.paalla;
    }

    @Override
    public boolean mute() {
        this.paalla=false;
        return this.paalla;
    }

    @Override
    public boolean unMute() {
        this.paalla=true;
        return this.paalla;
    }

    @Override
    public void setVolume() {
        this.volume++;
        if (this.volume>this.max) {
            this.mute();
            this.volume=this.max;
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void lisaaVolume(int luku) {
        this.volume=luku;
        if (this.volume>this.max) {
            this.mute();
            this.volume=this.max;
        }
    }

    @Override
    public int getMax() {
        return this.max;
    }

}
