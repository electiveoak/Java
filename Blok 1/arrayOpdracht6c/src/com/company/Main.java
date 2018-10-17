//author@Levi Somoopawiro
//

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lijst = new int[3];

        int zoekgetal = 0;
        int gelijk = 0;
//        genereerGetallen(lijst);
        for (int i = 0; i <lijst.length ; i++) {
            System.out.println(lijst[i]);
        }

        System.out.println("geef 3 verschillende getallen tussen 1 en 10 gescheiden door spaties");
        zoekgetal = scanner.nextInt();

        for (int i = 0; i < lijst.length; i++) {
            if (zoekgetal == lijst[i]) {
                gelijk++;
            }
        }
        System.out.println("getallen gelijk:"+gelijk);

    }

    public static int[] genereerGetallen(int[] lijst) {
        for (int i = 0; i < lijst.length; i++) {
            lijst[i] = (int) (Math.random() * 10) + 1;
            while ()
        }
        return lijst;
    }

//    public static boolean komtVoorIn(int zoekgetal, int[] lijst) {
//        for (int i = 0; i < lijst.length; i++) {
//            if (zoekgetal == lijst[i]) {
//            }
//        }
//        return false;
//    }
}


