package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayı iste sonra onları çarpma yaptırın

        //1. adım alttaki formülü yaz
        Scanner scan=new Scanner(System.in);

        //2. adım bilgi vermek
        System.out.println("Lültfen 1.sayıyı giriniz");

        //3. adım bilgiyi scan objesi ile alacağız
        double sayi1=scan.nextDouble();

        //4. adım. bilgi vermek
        System.out.println("lütfen 2.sayıyı giriniz");

        double sayi2=scan.nextDouble();
        //5.çarpımlarını yozdır
        System.out.println("sayıların çarpıma="+sayi1*sayi2);
    }
}
