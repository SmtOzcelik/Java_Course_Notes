package day13_methodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanıcıdan sifre iste.Asagıdaki sartları saglıyorsa
        "Sifre başarı ile tamamalandı" değilse "islem basarısız,Lütfen yeni sifre gir"
         -ilk harf buyuk olmalı
         -son harf kucuk olmalı
         -sifre bosluk icermemeli
         sifre uzunlugu en az 8 karakter olmalı
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();
        int kontrol=0;

        // ilk harf kontrolu
        if(sifre.charAt(0)>='A' && sifre.charAt(0)<'Z'){
            kontrol++;
        }else{
            System.out.println("ilk harf buyuk olmalı");
        }

        // son harf kontrolü
        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else {
            System.out.println("son harf kucuk olmalı");
        }
        // bosluk kontrolü
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }else {
            kontrol++;
        }
        // sifre uzunluk kontrolü
        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("sifre en az 8 karakter olmali");
        }
        if(kontrol==4){
            System.out.println("sifre basarı ile tamamlandı");
        }else {
            System.out.println("islem basarısız,lütfen yeni bir sifre giriniz");
        }
    }
}
