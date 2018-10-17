import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int GEWONNEN = 4;
        int[] team1score = new int[7];
        int[] team2score = new int[7];
        int team1Gewonnen = 0;
        int team2Gewonnen = 0;
        int totaalWedstrijden = 0;
        String team1;
        String team2;

        System.out.println("Dit programma is gemaakt door Levi Somopawiro, IS107, 500802522");

        //teamnamen inlezen
        System.out.println("Naam van team 1: ");
        team1 = scanner.nextLine();
        System.out.println("Naam van team 2: ");
        team2 = scanner.nextLine();

        int i = 0;

        //uitslagen van de wedstrijd inlezen
        while ((team1Gewonnen != GEWONNEN) && (team2Gewonnen != GEWONNEN)) {
            totaalWedstrijden++;
            i++;
            System.out.println("Uitslag wedstrijd " + i);
            System.out.println("Aantal punten" + team1);
            team1score[i] = scanner.nextInt();
            System.out.println("Aantal punten" + team2);
            team2score[i] = scanner.nextInt();
            if (team1score[i] > team2score[i]) {
                team1Gewonnen++;
            } else if (team2score[i] > team1score[i]) {
                team2Gewonnen++;
            }
        }

        //aantal gespeelde wedstrijden afdrukken
        System.out.println("aantal gespeelde wedstrijden: " + totaalWedstrijden);
        //winnaar en totaaluitslag afdrukken
        printWinnaar(team1, team2, team1Gewonnen, team2Gewonnen);
        //uitslagen van alle wedstrijden afdrukken
        for (int j = 1; j <= totaalWedstrijden; j++) {
            System.out.println("wedstrijd " + j + ": " + team1 + " - " + team2 + " " + team1score[j] + " - " + team2score[j]);
        }
    }

    static void printWinnaar(String team1, String team2, int aantalWinstTeam1, int aantalWinstTeam2) {
        if (aantalWinstTeam1 > aantalWinstTeam2) {
            System.out.println(team1 + " heeft gewonnen met " + aantalWinstTeam1 + " - " + aantalWinstTeam2);
        } else if (aantalWinstTeam2 > aantalWinstTeam1) {
            System.out.println(team2 + " heeft gewonnen met " + aantalWinstTeam2 + " - " + aantalWinstTeam1);
        }
    }
}
