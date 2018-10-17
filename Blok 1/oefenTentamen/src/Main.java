//Dit programma is gemaakt door Levi Somopawiro, IS107, 500802522
//doel programma: scores invoeren van teams als een team vervolgens 4 keer heeft gewonnen
// print hij de wedstrijden uit met behorede scores


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int GEWONNEN = 4;
        String team1;
        String team2;
        int gespeeldeWedstrijden = 0;
        int[] scoreTeam1 = new int[0];
        int[] scoreTeam2 = new int[0];
        int team1Gewonnen = 0;
        int team2Gewonnen = 0;


        Scanner scanner = new Scanner(System.in);
        // vraagt om team namen
        System.out.println("Naam van team 1: ");
        team1 = scanner.nextLine();
        System.out.println("Naam van team 2: ");
        team2 = scanner.nextLine();

        scoreTeam1 = new int[7];
        scoreTeam2 = new int[7];
        // vraagt om wedstrijd resultaten totdat een team 4 keer heeft gewonnen
        for (int i = 0; i < 7; i++) {
            gespeeldeWedstrijden++;

            System.out.println("Uitslag wedstrijd " + (i + 1));

            System.out.print("Aantal punten " + team1 + ":");
            scoreTeam1[i] = scanner.nextInt();

            System.out.print("Aantal punten " + team2 + ":");
            scoreTeam2[i] = scanner.nextInt();

            if (scoreTeam1[i] > scoreTeam2[i]) {
                team1Gewonnen++;
            } else if (scoreTeam2[i] > scoreTeam1[i])
                team2Gewonnen++;
            if (GEWONNEN  == team1Gewonnen|| GEWONNEN == team2Gewonnen) {
                break;
            }
        }
        //print gespeelde wedstrijd uit met winnaar en scores van matches
        System.out.println("Aantal gespeelde wedstrijden: " + gespeeldeWedstrijden);
        if (team1Gewonnen == GEWONNEN) {
            System.out.println(team1 + " Heeft gewonnen ");
        } else if (team2Gewonnen == GEWONNEN) {
            System.out.println(team2 + " Heeft gewonnen ");
        }
        for (int i = 0; i < gespeeldeWedstrijden; i++) {
            System.out.println("wedstrijd " + (i + 1) + ": " + team1 + " - " + team2 +
                    " " + scoreTeam1[i] + " - " + scoreTeam2[i]);
        }
    }
}
