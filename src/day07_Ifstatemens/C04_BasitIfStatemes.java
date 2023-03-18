package day07_Ifstatemens;

import java.util.Scanner;

public class C04_BasitIfStatemes {
    public static void main(String[] args) {
        /*
        Kullanıcadan gün ismi alın. hafta içi veya hafta sonu olduğunu yazdırın.
        soru = gün sali ise hafta içi, gün pazar ise hafta sonu
        ipucu= String için equals metodunu kullanın.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz.");
        String gunismi=scan.next().toLowerCase();

        // Pazar pazar PAZAR gibi farklılıkları önlemek için
        // aldığını küçük harfe çekvir al demek için toLowerCase() ekledik.

        if (gunismi.equals("pazar")||gunismi.equals("cumartesi"))
            // String de eşitlik sağlıklı olmayacağı için .equals main kullandik

        {System.out.println("Girilen gün hafta sonudur.");}
        if (gunismi.equals("pazartesi")||gunismi.equals("sali")||gunismi.equals("carsamba")
                ||gunismi.equals("perşembe")||gunismi.equals("cuma"))
        {
            System.out.println("Girilen gün hafta içi dir.");}
        if (!(gunismi.equals("pazartesi")||gunismi.equals("sali")||gunismi.equals("carsamba")
                ||gunismi.equals("perşembe")||gunismi.equals("cuma")||gunismi.equals("cumartesi")
                ||gunismi.equals("pazar")))
        {
            System.out.println("Lütfen geçerli bir gün giriniz.");}

    }
}
