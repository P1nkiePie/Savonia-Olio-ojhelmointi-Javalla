package com.company;

public interface ITelephoneMic {
    boolean micOn();
    boolean micOff();
    void setVolume();
    int getVolume();
    boolean onkoPaalla();
    int getMax();
}
