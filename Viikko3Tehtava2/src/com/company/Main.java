package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Double> lista = new ArrayList<>();
        MathUtils staattiset = new MathUtils();
        lista.add(3.5);
        lista.add(2.3);
        lista.add(5.8);
        lista.add(7.0);
        lista.add(6.7);

        MathUtils.LaskeYhteen(lista);
        MathUtils.SuurinLuku(lista);
        MathUtils.LaskeKeskiarvo(lista);
    }
}
