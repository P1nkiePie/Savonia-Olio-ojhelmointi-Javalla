package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileUtils {
    public static void ReadFromFile() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Mistä tiedostosta luetaan: ");
        String tiedosto = lukija.nextLine();
        try (Scanner txtlukija = new Scanner(Paths.get(tiedosto))) {
            while (txtlukija.hasNextLine()) {
                System.out.println(txtlukija.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void WriteToFile() {
        Runnable luetxt = new Luetiedostosta();
        Thread saie = new Thread(luetxt);
        saie.run();
    }
}
