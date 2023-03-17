package day05_mat;

import java.util.Scanner;

public class C03_RakamlarToplamı {
    public static void main(String[] args) {

        // kullanıcadan 4 basamaklı sayı al rakamlarını topla

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayı giriniz.");
        int sayi=scan.nextInt();//5267 yazmıs olsun.

        // 2 adet konteynir lazım degerleri doldurmak için
        int birlerbasamagi=0;
        int rakamlartoplami=0;
        int ilkgirilensayi=sayi;

        // suanda sayı 5267 bb=0 rt=0
        birlerbasamagi=sayi%10; //7 i buldu. bunu rakamlar toplamı konteynirina atalım.
        rakamlartoplami +=birlerbasamagi;
        sayi /= 10;

        // şuanda sayı 526 oldu ve rakamlar toplamı 7
        birlerbasamagi=sayi % 10;// birler samaği 6 olur
        rakamlartoplami +=birlerbasamagi; // rakamlar toplamı 13 oldu
        sayi /=10; // sayı 52 oldu
        birlerbasamagi=sayi%10; // 2 yi buldu. rakamlar toplamına aktar.
        rakamlartoplami +=birlerbasamagi; // rakamlar toplamı 15 oldu.
        sayi /=10;// sayi 5 oldu.
        birlerbasamagi=sayi%10;
        rakamlartoplami +=birlerbasamagi;
        sayi /=10;// sayi artık sıfır. rakamlar toplamı 20 oldu.
        System.out.println(ilkgirilensayi +"  Saynın rakamlar toplamı="+rakamlartoplami);






    }
}
