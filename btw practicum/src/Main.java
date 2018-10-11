import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // inkoop prijs en winstmarge opvragen
        Scanner input = new Scanner(System.in);
        System.out.println("inkoop prijs");
        double inkoopprijs = input.nextDouble();

        System.out.println("Winstmarge in %");
        int winstmarge = input.nextInt();

        //de pris uitrekenen met winstmarge
        double BTW_GEEN =  (inkoopprijs * winstmarge/100) + inkoopprijs;

        //de btw in een constant zetten
        final double btwlaag = 1.06;
        final double btwhoog = 1.21;

        //de pris uitrekenen met btw
        double BTW_LAAG     =   BTW_GEEN * btwlaag;
        double BTW_HOOG     =   BTW_GEEN * btwhoog;

        //de prijzen uitrekenen
        System.out.println("prijs zonder btw: " + BTW_GEEN);
        System.out.println("prijs 6& btw: " + BTW_LAAG);
        System.out.println("prijs 21% btw: " + BTW_HOOG);

        }
}
