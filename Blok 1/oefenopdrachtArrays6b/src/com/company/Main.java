/*
Author@Levi Somopawiro
het programma genereert een rij getallen en telt vervolgens hoe vaak een getal voorkomt.
dit word afgedrukt amen met het percentage dat het word afgedrukt
 */
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAXGROOTTE = 25;
        final int MINGROOTTE = 5;
        final int MAXRANDOM = 10;
        final int MINRANDOM = 0;
        int grootte = 0;
        int zoek = -1;
        int totaal = 0;
        int[] getallen = new int[grootte];
        double voorval = 0.0;

        while (!(grootte >= MINGROOTTE) || !(grootte <= MAXGROOTTE)) {
            //vraagt hij om de grootte van de array
            System.out.println("hoe groot moet de array zijn (5..25)?");
            grootte = input.nextInt();

            //checkt hij of de array groter is dan 5 en kleiner dan 25.
            if (grootte >= MINGROOTTE && grootte <= MAXGROOTTE) {
                getallen = new int[grootte];

                //maakt vervolgens een array aan met grootte die gebruiker heeft ingevuld
                // en print array uit gevult met random getallen.
                System.out.println("de array grootte is " + getallen.length);
                for (int i = 0; i < getallen.length; i++) {
                    getallen[i] = (int) (Math.random() * MAXRANDOM);
                    System.out.print(getallen[i] + " ");
                }
            } else {
                System.out.println("Het zoek getal moet tussen 5 en 25 zitten probeer nog eens");
            }
        }
        //vraagt hoe vaak een bepaald getal voor komt en print percentage uit met voorkomen getal


        while (zoek < MINRANDOM || zoek >= MAXRANDOM) {
            System.out.println("\nWelk getal moet ik zoeken (0...9?)");
            zoek = input.nextInt();
            if (zoek >= MINRANDOM && zoek <= 9) {
                for (int i = 0; i < getallen.length; i++) {
                    if (zoek == getallen[i]) {
                        totaal++;
                    }
                }
            } else {
                System.out.println("het zoekgetal moet tussen 0 en 9 liggen! probeer het nog eens");
            }
        }
        voorval = ((double) totaal) / getallen.length * 100;
        System.out.println("Het getal " + zoek + " komt " + totaal + " keer voor in de lijst");
        System.out.println("dat betekent dat " + voorval + "% van de getallen in de array gelijk is aan " + zoek);


    }
//    public static boolean isGenoeg () {
//        return true;
//    }

}

