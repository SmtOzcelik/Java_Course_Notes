package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        // soru: kullanicidan email adresini girmesini isteyin,
        // mail de @gmail.com içermiyorsa "Lütfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
        //@gmail.com ile bitmiyorsa "Lütfen yazimi kontrol edin" yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen email adresinizi giriniz");
        String email=scan.nextLine();

        if(!email.contains("@gmail.com")){
            System.out.println("Lütfen @gmail yazınız.");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedildi.");

        }else {
            System.out.println("Lütfen yazimi kontrol edin.");
        }
    }
}
