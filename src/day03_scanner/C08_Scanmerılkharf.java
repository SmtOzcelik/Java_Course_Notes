package day03_scanner;

import java.util.Scanner;

public class C08_Scanmerılkharf {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp ilk harfini büyük harf olarak yazdır

        Scanner scan=new Scanner(System.in);
        System.out.printf("Lütfen isminizi giriniz");

        // java da scanner class da next char metodu yoktur
        //bunun yerine String ilk kelimeyi alıp onunda ilk harfini alabiliriz
        char ilkharf=scan.next().toUpperCase().charAt(0);
        
        //toUpperCase()= anlamı büyük harf seçimi
        //charAt()= anlamı kelimenin kaçıncı harfi seçileceğini belli eder

        System.out.println("ismin ilk harfi="+ilkharf);

    }
}
