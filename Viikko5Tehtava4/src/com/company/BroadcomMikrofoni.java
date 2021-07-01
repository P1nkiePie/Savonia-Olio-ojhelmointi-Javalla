package com.company;

public class BroadcomMikrofoni implements ITelephoneMic{
    private int volume;
    private boolean paalla;
    private int max;

    public BroadcomMikrofoni() {
        this.volume=0;
        this.paalla=false;
        this.max=100;
    }

    @Override
    public boolean onkoPaalla() {
        return this.paalla;
    }

    @Override
    public boolean micOn() {
        this.paalla=true;
        return this.paalla;
    }

    @Override
    public boolean micOff() {
        this.paalla=false;
        return this.paalla;
    }

    @Override
    public void setVolume() {
        this.volume++;
        if (this.volume>100) {
            this.micOff();
            this.volume=this.max;
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int getMax() {
        return this.max;
    }
}
