//auteur Levi Somopawiro Practic um week 3 2018

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //de waarde van een gehaald vak in studiepunten
        final int FYS_gehaald = 12;
        final int Prog_gehaald = 3;
        final int Data_gehaald = 3;
        final int Pers_gehaald = 2;
        final int Proj_gehaald = 2;

        final int FYS_gefaald = 0;
        final int Prog_gefaald = 0;
        final int Data_gefaald = 0;
        final int Pers_gefaald = 0;
        final int Proj_gefaald = 0;

        //het aantal uiteindelijke studiepunten van de student worden hier in gezet
        int studiepunten = 0;

        //de student voert hier zijn cijfers in
        System.out.println("voer behaalde cijfers in");
        System.out.println("Fasten your seatbelts");
        double FYS1 = input.nextDouble();
        System.out.println("Programming");
        double Prog1 = input.nextDouble();
        System.out.println("Databases");
        double Data1 = input.nextDouble();
        System.out.println("Personal skills");
        double Pers1 = input.nextDouble();
        System.out.println("Project skills");
        double Proj1 = input.nextDouble();

        // hier word bekeken of de cijfers voldoende zijn en de studie punten vervolgens met elkaar opgeteld
        if (FYS1 >= 5.5) {
            studiepunten = studiepunten + FYS_gehaald;
            System.out.println("Vak/project: Fasten Your Seatbelts  " + "Cijfer: " + FYS1 + " bEHAALDE PUNTEN: " + FYS_gehaald);
        } else
            System.out.println("Vak/project: Fasten Your Seatbelts  " + "Cijfer: " + FYS1 + " bEHAALDE PUNTEN: " + FYS_gefaald);

        if (Prog1 >= 5.5) {
            studiepunten = studiepunten + Prog_gehaald;
            System.out.println("Vak/project: Programming  " + "Cijfer: " + Prog1 + " bEHAALDE PUNTEN: " + Prog_gehaald);
        } else
            System.out.println("Vak/project: Programming  " + "Cijfer: " + Prog1 + " bEHAALDE PUNTEN: " + Prog_gefaald);

        if (Data1 >= 5.5) {
            studiepunten = studiepunten + Data_gehaald;
            System.out.println("Vak/project: Database  " + "Cijfer: " + Data1 + " bEHAALDE PUNTEN: " + Data_gehaald);
        } else
            System.out.println("Vak/project: Database  " + "Cijfer: " + Data1 + " bEHAALDE PUNTEN: " + Data_gefaald);

        if (Pers1 >= 5.5) {
            studiepunten = studiepunten + Pers_gehaald;
            System.out.println("Vak/project: Personal skills  " + "Cijfer: " + Pers1 + " bEHAALDE PUNTEN: " + Pers_gehaald);
        } else
            System.out.println("Vak/project: Personal skills  " + "Cijfer: " + Pers1 + " bEHAALDE PUNTEN: " + Pers_gefaald);

        if (Proj1 >= 5.5) {
            studiepunten = studiepunten + Proj_gehaald;
            System.out.println("Vak/project: Project skills  " + "Cijfer: " + Proj1 + " bEHAALDE PUNTEN: " + Proj_gehaald);
        } else
            System.out.println("Vak/project: Project skills  " + "Cijfer: " + Proj1 + " bEHAALDE PUNTEN: " + Proj_gefaald);

//aantal behaalde studie punten weergeven samen met advies
        System.out.println("je hebt " + studiepunten + ("/22 studiepunten!"));
        if (studiepunten <= 18) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA");
        } else {
            System.out.println("helemaal top");
        }


    }
}
