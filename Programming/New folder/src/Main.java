// dit importeren zodat we de functie kunnen gebruiken om gebruiker te laten invoeren.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //de scanner gebruiken die de gebruikers dingen laten invoeren
        Scanner input = new Scanner(System.in);

        System.out.print("Gewicht in kg: ");
        //wat de gebruiker invult is het gewicht.
        double gewicht = input.nextDouble();

        //wat de gebruiker invult is de lengte.
        System.out.print("gewicht in cm: ");
        int  lengte = input.nextInt();

        //bmi uitrekenen met de gegeven info.
        double bmi = gewicht / (lengte * lengte /10000);

        //de bmi variable weergeven.
        System.out.println("je BMI is: " + bmi);

    }
}
