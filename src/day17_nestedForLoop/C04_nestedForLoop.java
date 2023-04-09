package day17_nestedForLoop;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen input a gore yıldızlardan bir ucgen olusturun
        ornek input=4 ise
        *
        * *
        * * *
        * * * *     gibi
        */

        int input=4;

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
