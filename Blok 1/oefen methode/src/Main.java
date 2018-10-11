public class Main {

    public static void main(String[] args) {
        String myName = "joy";
        System.out.println(maximumBepalen(3, 6, 9));
        System.out.println(tellMyName("Kees"));
        changeNameToBob(myName);

    }

    public static int maximumBepalen(int getal1, int getal2, int getal3) {

        return Math.max(getal1, Math.max(getal2, getal3));

    }

    public static String tellMyName(String name) {
        return name;
    }

    public static  void changeNameToBob (String name) {
        name = "Bob";
        System.out.println(name);
    }
}

// public static void herhaalBoodschap(String boodschap, int aantal) {
//        for (int i = 0; i < aantal; i++)    {
//            System.out.println(boodschap);
//        }
//    }

