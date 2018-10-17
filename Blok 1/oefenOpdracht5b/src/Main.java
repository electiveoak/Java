import java.util.Scanner;

//author@Levi Somopawiro
//maak metodes om een dobbelsteen te gooien en een om af te drukken
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int dobbelNummer = 0;
        char karakter = ' ';

        System.out.println("bepaal het oog van de dobbelsteen");
        karakter = scanner.next().charAt(0);

        for (int i = 1; i <=200 ; i++) {
            dobbelNummer = gooiDobbelsteen();
            toonDobbelsteen(dobbelNummer,karakter);
            if (i % 25 == 0) {
                System.out.println();
            }


        }
    }

    public static int gooiDobbelsteen() {
       return (int) (Math.random() * 6)+ 1;
    }
    public static void toonDobbelsteen(int aantalOgen, char karakter) {
        if (aantalOgen == 1) {
            System.out.print("\n"+" " + karakter + "\n" );
        } else if (aantalOgen == 2) {
            System.out.print(karakter + "\n \n" +"  " +karakter+ "  ");
        } else if (aantalOgen == 3) {
            System.out.print(karakter + "\n" + " " + karakter
                                + "\n" + "  " + karakter +"  ");
        }
    }
}
