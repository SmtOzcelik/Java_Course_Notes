package day11_stringManipulations;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {

        // soru: kullanicidan email adresini girmesini isteyin,
        // mail de @gmail.com içermiyorsa "Lütfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
        //@gmail.com ile bitmiyorsa "Lütfen yazimi kontrol edin" yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen email adresinizi giriniz");
        String email=scan.nextLine();

        if(!email.contains("gmail.com")){
            System.out.println("lütfen gmail adresi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kayıt edildi.");

        }else {
            System.out.println("Lütfen yazımı kontrol ediniz.");
        }
    }
}
