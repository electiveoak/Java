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
        int vakkenGehaald = 0;
        double[] vakCijfers = new double[VAKNAMEN.length];
        int puntenTotaal = 0;

        System.out.println("Voer behaalde cijfers in: ");

        for (int i = 0; i < VAKNAMEN.length; i++) {
            System.out.println(VAKNAMEN[i]);
            vakCijfers[i] = scanner.nextDouble();
            while ((vakCijfers[i] < 1) || (vakCijfers[i] > 10)) {
                System.out.println("het cijfer is te hoog of te laag");
                System.out.println(VAKNAMEN[i]);
                vakCijfers[i] = scanner.nextDouble();
            }
            if (vakCijfers[i] >= MIN) {
                puntenTotaal = puntenTotaal + VAKPUNTEN[i];
                vakkenGehaald++;
            }
        }
        for (int i = 0; i < VAKNAMEN.length; i++) {
            if (vakCijfers[i] >= MIN) {
                System.out.println("vak/project: " + VAKNAMEN[i] + " Cijfer: " + vakCijfers[i] + " Behaalde punten: " + VAKPUNTEN[i]);
            } else {
                System.out.println("vak/project: " + VAKNAMEN[i] + " Cijfer: " + vakCijfers[i] + " Behaalde punten: 0");
            }
        }
        System.out.println(puntenTotaal + "/28");

        if (puntenTotaal <= 6) {
            System.out.println("je hebt " + vakkenGehaald + "/" + VAKNAMEN.length + "studiepunten vakken gehaald. Pas op je bent op pad naar een negatief bsa  ");
        } else {
            System.out.println("je hebt " + vakkenGehaald + "/" + VAKNAMEN.length + "studiepunten vakken gehaald. ga zo door ");
        }
    }

}

