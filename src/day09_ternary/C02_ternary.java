package day09_ternary;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayi alin ve sayi pozitifse "sayi pozitif" yazdırın,
        negatifse sayının karesini yazdırın.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        // atama yapamadık çünkü içinde ki sonuçlar double ve string oldugu için hangisine göre h
        // hareket edeceğini bilemez hata verir. o yüzden direk yazdırdık

        System.out.println(sayi>=0?"sayi pozitif":sayi*sayi);
    }
}
