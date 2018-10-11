//@author levi somopawiro
//een dobbelsteen waarbij de gebruiker de oog bepaald
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totaal = 0;
        //bepaald het oog van de dobbelsteen
        System.out.println("vul een karakter in");
        char symbol = input.next().charAt(0);
        //genereerd een willekeurig getal tussen 0 en 6
        //stopt pas met generen als het de 6 bereikt
        while (totaal != 6) {
            totaal = (int) (Math.random() * 6) + 1;
            if (totaal == 1) {
                System.out.println("\n" + " " + symbol + "\n");
            }
            if (totaal == 2) {
                System.out.println(symbol + " " + "\n\n" +
                        "  " + symbol + "\n");
            }
            if (totaal == 3) {
                System.out.println(symbol + "  \n" + " " + symbol +
                        "\n" + "  " + symbol + "\n");
            }
            if (totaal == 4) {
                System.out.println(symbol + " " + symbol + "\n"
                        + "\n" +
                        symbol + " " + symbol + "\n");
            }
            if (totaal == 5) {
                System.out.println(symbol + " " + symbol + "\n" +
                        " " + symbol + "\n" +
                        symbol + " " + symbol + "\n");
            }
            if (totaal == 6) {
                System.out.println(symbol + " " + symbol + "\n" +
                        symbol + " " + symbol + "\n" +
                        symbol + " " + symbol + "\n");
            }
        }
    }
}
