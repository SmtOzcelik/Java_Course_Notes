package day09_ternary;

import java.util.Scanner;

public class C05_switchCase {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün numarasını alip 1 ise pazartesi, ... , 7 ise pazar yazdiralim.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz.");
        int gunno=scan.nextInt();

        /* switch yanina yazılan ( ) neye göre atayacağımızı gösterir.
           java girilen değere göre case yi bulur ve o satırdan çalıştırmaya başlar
           break yazısı görünceye ve switch ( ) kadar devam eder.

           if-else if-... else yapısında olduğu gibi hiç bir şarta uymayanlari default kodu girip bitiriyoruz.
         */

        switch (gunno){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("lütfen geçerli gün olduğunu giriniz.");

        }
    }
}
