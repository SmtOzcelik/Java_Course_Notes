package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini soyismini ve yaşını alıp
        // girilen bilgilier= Ali Seyfi Kapar 34

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen isminizi yazınız.");
        // eğer birden fazla kelimeli isimlerde nextLine kullanılır.
        String isim=scan.nextLine();
        System.out.println("lütfen soyadınızı yazınız.");
        String soyadı=scan.nextLine();
        System.out.println("lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();
        System.out.println("Girilen bilgiler="+isim+" "+soyadı+" "+yas);


    }
}
