package day17_nestedForLoop;

public class C03_nestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen yukseklik ve boy degerine göre * lardan oluşan bir dikdörtgen olustur
           yukseklik:3 boy:4
            * * * *
            * * * *
            * * * *   gibi
        */

        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
