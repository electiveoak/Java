package com.company;
/**
 * author@Levi Somopawiro
 * het prgoramma vraagt gebruiker om cijfers in te voeren
 * en bekijkt dan hoeveel studie punten je krijgt gebaseerd
 * op die cijfers en eeft vervolgens advies.
 * het gebruikt arrays
 **/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[] VAKNAMEN = {
                "Fasten Your Seatbelts",
                "Programming",
                "Database",
                "User interaction",
                "Object Oriented Programming",
                "Peronal Skills",
                "Project skills"};
        final int[] VAKPUNTEN = {12, 3, 3, 3, 3, 2, 2};
        final double MIN = 5.5;
        double[] vakCijfers = new double[VAKNAMEN.length];
        int puntenTotaal = 0;

        System.out.println("Voer behaalde cijfers in: ");

        for (int i = 0; i < VAKNAMEN.length; i++) {
            System.out.println(VAKNAMEN[i]);
            vakCijfers[i] = scanner.nextDouble();
            if (vakCijfers[i] >= MIN) {
                puntenTotaal = puntenTotaal + VAKPUNTEN[i];
            }
        }
        for (int i = 0; i<VAKNAMEN.length;i++)  {
            System.out.println("vak/project: " + VAKNAMEN[i] + " Cijfer: " + vakCijfers[i] + " Behaalde punten: " + VAKPUNTEN[i]);
        }
        System.out.println(puntenTotaal + "/28");
    }

}

