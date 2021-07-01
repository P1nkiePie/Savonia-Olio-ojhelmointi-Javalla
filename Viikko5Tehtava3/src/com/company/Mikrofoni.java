package com.company;

public class Mikrofoni implements ITelephoneMic{
    private int volume;
    private boolean paalla;

    public Mikrofoni() {
        this.volume=0;
        this.paalla=false;
    }

    @Override
    public boolean micOn() {
        this.paalla=true;
        return true;
    }

    @Override
    public boolean micOff() {
        this.paalla=false;
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
