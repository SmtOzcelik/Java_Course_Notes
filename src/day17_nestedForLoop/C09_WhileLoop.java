package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan sifre iste.Asagıdaki sartları saglıyorsa
        "Sifre başarı ile tamamalandı" değilse "islem basarısız,Lütfen yeni sifre girin
        ve basarili sifre girinceye kadar tekrar sifre girilmesini isteyin
         -ilk harf buyuk olmalı
         -son harf kucuk olmalı
         -sifre bosluk icermemeli
         sifre uzunlugu en az 8 karakter olmalı
         */

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi) {
            // kullanıcıdan bir sifre alalım
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            // 4 kontrol yapalim, her gecen kontrol icin kontol veriable ini 1 artıralim.
            // ilk harf kontrolu

            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) < 'Z') {
                kontrol++;
            } else {
                System.out.println("ilk harf buyuk olmalı");
            }

            // son harf kontrolü
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("son harf kucuk olmalı");
            }
            // bosluk kontrolü
            if (sifre.contains(" ")) {
                System.out.println("sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            // sifre uzunluk kontrolü
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("sifre en az 8 karakter olmali");
            }



        if (kontrol == 4) { // tum kontrollerden gecmistir.
            System.out.println("sifre basarı ile tamamlandı");
            sifreBasariliMi = true;
        } else {   // sifre basarısız
            //tekrar basa donecek
            // kontrol variable sifirlanmali
            kontrol = 0;


    }

            }
}}