package day18_while_dowhileloop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan tam sayilar alin. kullanıcı çift sayi girdigi müttetce
        sayiları yazdırın.tek sayi girdiğinde işlemi bitirin.
        */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        //while ile yapalim.

        /*
        loop larda kullanacagımız veriable ri loop dan önce olusturmaliyiz.
        while loop da, loopdan önce olusturduğumuz bu veriable a atayacağımız
        değeri iyi dusunmemiz gerekiyor.
        */

        while (sayi % 2 == 0) {
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift: " + sayi);
            } else {
                System.out.println("girilen sayi tek, benden bu kadar");
            }
        }
        // do while loop ile yapalim,
        /*
        -- do while loop da onceden olusturulan variable hangi deger atandiginin
               hic bir onemi yok,kodumuz her durumda calisir.
        -- ilk calistirma kontrol yapilmadan olduğu icin loop un badisinde yanlıs bir
              islem yapılmamasina dikkat etmek gerekir
        */

        do {
            System.out.println("lütfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift: " + sayi);
            } else {
                System.out.println("girilen sayi tek, benden bu kadar");
            }

        }while (sayi%2==0);
    }
}