package com.company;
import java.util.*;

public class Lottorivi {
    private ArrayList<Integer> rivi;

    public Lottorivi() {
        this.rivi = new ArrayList<>();
        this.arvoNumerot();
    }

    public ArrayList<Integer> rivi() {
        ArrayList<Integer> palautettava = new ArrayList<>();
        this.rivi.stream().sorted().forEach(numero -> palautettava.add(numero));
        return palautettava;
    }

    public boolean sisaltaa(int num) {
        return this.rivi.contains(num);
    }

    public void arvoNumerot() {
        this.rivi = new ArrayList<>();
        while (this.rivi.size() < 7) {
            int lisattava = new Random().nextInt(39);
            if (!this.sisaltaa(lisattava)) this.rivi.add(lisattava);
        }
    }
}
