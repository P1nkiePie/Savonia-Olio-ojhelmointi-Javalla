package com.company;

public class PrintDiamond implements Runnable{

    @Override
    public void run() {
        for (int i=1; i<=7; i++) {
            for (int l=1; l<=7-i; l++) {
                System.out.print(" ");
            }
            for (int l=1; l<=i*2-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=7-1; i>0; i--) {
            for (int j=1; j<=7-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
