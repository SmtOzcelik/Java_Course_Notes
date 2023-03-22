package day11_stringManipulations;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {

        /*
        soru: kullanıcıdan bir cümle isteyin.
        cümle "buyuk" kelimesi içeriyorsa tum cumle buyuk harf olarak,
        cumle "kucuk" kelimesi içeriyorsa tüm cumle kucuk harf olarak yazdırın.
        iki kelimeyide içermiyorsa "cumle kucuk yada buyuk kelimesi icermiyor" yazdırın.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cumle yazınız.");
        String cumle=scan.nextLine();
        cumle=cumle.toLowerCase();  // bilerek hep kucuk oku büyükleride görmesi için.
        if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
    } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else{
            System.out.println("cumle kucuk yada buyuk kelimesi icermiyor.");
        }
    }}
