package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// vraag lengte en breedte aan de gebruiker
        Scanner input = new Scanner(System.in);
        System.out.println("geef lengte rechthoek: ");
        double lengte = input.nextDouble();

        System.out.println("geef breedte rechthoek: " );
        double breedte = input.nextDouble();
    //bereken oppervlakte en omtrekte
                double omtrek = 2 * lengte + 2 * breedte;
                double omvang = lengte * breedte;

        //laat omtrek zien
        System.out.println(("de omtrek is: ")+omtrek);
        System.out.println(("de omvang is: ")+omvang);
    }
}
