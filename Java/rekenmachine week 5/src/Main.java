//author @levi somopawiro
//
//het programma is een rekenmachine die methods gebruikt.
// Het progamma vraagt de gebruiker om een geldige operator en twee verschilende nummers om een som te maken.
//die som laat hij vervolgens zien met het antwoord.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final char STOPPEN = 'S';
        double getal1 = 0;
        double getal2 = 0;
        char operator = ' ';

        Scanner input = new Scanner(System.in);

        while (operator != STOPPEN) {
            //checkt of ingevoerde operator goed is indien fout vraagt hij om nieuwe operator
            System.out.println("Operator (S = stoppen) : ");
            operator = input.next().charAt(0);
            // hier roepen we die methode die ckecht of de operator goed is
            if (isGeldigOperator(operator)) {
                System.out.println("Eerste getal");
                getal1 = input.nextDouble();

                System.out.println("Tweede getal");
                getal2 = input.nextDouble();
                //hier roepen we de methode op die de some berekent en uitprint
                printSom(operator, getal1, getal2);

                //als S word getyped stopt het programma
            } else if (operator == STOPPEN) {
                System.out.println("je bent nu gestopt");
            } else {
                System.out.println("ongeldige operator");
            }
        }
    }

    //met deze methode word som uitgerekent en nogmaals uitgeprint
    static void printSom(char operator, double getal1, double getal2) {
        if (operator == '-') {
            System.out.print(getal1 + " - " + getal2 + " = ");
            getal1 = getal1 - getal2;
            System.out.println(getal1);
        } else if (operator == '+') {
            System.out.print(getal1 + " + " + getal2 + " = ");
            getal1 = getal1 + getal2;
            System.out.println(getal1);
        } else if (operator == '*') {
            System.out.print(getal1 + " * " + getal2 + " = ");
            getal1 = getal1 * getal2;
            System.out.println(getal1);
        } else if (operator == '/') {
            System.out.print(getal1 + " / " + getal2 + " = ");
            getal1 = getal1 / getal2;
            System.out.println(getal1);
        } else if (operator == '%') {
            System.out.print(getal1 + " % " + getal2 + " = ");
            getal1 = getal1 / getal2;
            System.out.println(getal1);
        }
    }

    //hier woord bepaald welke functie elke operator heeft
    static boolean isGeldigOperator(char karakter) {

        if (karakter == '+' || karakter == '-' || karakter == '*' || karakter == '/' || karakter == '%') {
            return true;
        } else {
            return false;
        }
    }
}

