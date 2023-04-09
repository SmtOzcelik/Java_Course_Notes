package day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        Verilen input a göre * lardan oluşan asagıdaki sekli oluşturun
        input=4
        *
        * *        burda artan loop
        * * *
        * * * *
        * * *      burda azalan loop
        * *
        *

        */

        // artan kısmi nested forloop ile yapalim

        int input=4;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
        for (int i = input-1; i>=1 ; i--) { // 4 yıldız tekrar yazdırmamak icin input-1
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
