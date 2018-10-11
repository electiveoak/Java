/*oefenen mat strings @author Levi Somopawiro
ctrl + alt + l

*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String zin = input.nextLine();
        int index = zin.indexOf(" ");
        int aantalKarakters = zin.length();
        char eersteKarakter = zin.charAt(0);


        System.out.println("Geef me een zin van 3 woorden");

        System.out.println("Dit was aantal karakter in de zin: "
                + aantalKarakters);

        System.out.println("eerdte letter in de zin is: "
                + eersteKarakter);

        System.out.println("de index van spatie is: "
                + index);

        String eersteWoord = zin.substring(0,index);
        System.out.println("eerste word in hoofdletters: " + eersteWoord);
        System.out.println("complete zin in hoofdletters: " + zin.toUpperCase());
    }
}
