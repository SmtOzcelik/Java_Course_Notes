package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        // yan yana 3 yıldız yazdır

        for (int i = 1; i <=3 ; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        // *
        // * *
        // * * *
        // * * * *
        // * * * * * şeklinde yazdır dersem devreye nestedforloop giriyor

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
