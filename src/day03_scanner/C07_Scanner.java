package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan ismini soyismini ve yaşını alıp
        // girilen bilgilier= Ali Seyfi Kapar 34
        //  tek seferde kullanıcıdan tüm bilgileri alarak yapınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ad soyad yaş giriniz her seferinde enter bas");
        String ad=scan.nextLine();
        //kelime girilmesinde nextLine yazılır.
        String soyad=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("Girilen bilgiler="+ad+" "+soyad+" "+yas);

    }
}
