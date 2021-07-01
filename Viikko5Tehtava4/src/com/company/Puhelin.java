package com.company;

public class Puhelin {
    private ITelephoneSpeaker kaiutin;
    private ITelephoneMic mikrofoni;

    public Puhelin() {

    }

    public void setKaiutin(ITelephoneSpeaker kaiutin) {
        this.kaiutin = kaiutin;
    }

    public void setMikrofoni(ITelephoneMic mikrofoni) {
        this.mikrofoni = mikrofoni;
    }

    public ITelephoneSpeaker getKaiutin() {
        return kaiutin;
    }

    public ITelephoneMic getMikrofoni() {
        return mikrofoni;
    }
}
