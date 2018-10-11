// @autohor Levi Somopawiro  500802522

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
// variables declareren
        int i = 0;
        int tel;
        int plof;

//vraag gebruiker voor een getal tussen 2 en 9
        System.out.println("Wat is het Plof getal (2...9)?");
        plof = input.nextInt();

//vraag gebruiker een maxium tot hoe ver het programma moet tellen
        System.out.println("Tot en met welk getal moet ik tellen?");
        tel = input.nextInt();

//loop tot dat het maxium getal is bereikt
//elke keer dat een cijfer deelbaar is door het plof getal word dat getal vervangen met het woordje plof
        while (i < tel) {
            i++;
            if (i % plof == 0) {
                System.out.print("plof ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
