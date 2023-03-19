package day08_IfStatemens;

import java.util.Scanner;

public class C05_NestedIfElseStatement {
    public static void main(String[] args) {
        /*
        Nested if kullanarak soruyu çöz. kullanıcıdan bir şifre girmesini isteyin.
        Eğer şifre büyük harf ise "A" olup olmadığını kontrol edin.
        ilk harf "A" ise "Geçerli şifre" yaz değilse "Geçersiz Şifre"yaz
        Eğer şifre küçük harf ise "z" olup olmadığını kontrol edin.
        ilk harf "z" ise "geçeril şifre" yaz değilse "Geçersiz Şifre"yaz
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Şifreyi Giriniz");
        String sifre =scan.nextLine();
        char ilkharf=sifre.charAt(0);

        if(ilkharf>='A' && ilkharf<='Z'){
            if(ilkharf=='A'){
                System.out.println("Geçerli sifre");
            }else {
                System.out.println("Geçersiz sifre");
            }

        }else if(ilkharf>='a' && ilkharf<='z'){
            if(ilkharf=='z'){
                System.out.println("Geçerli sifre");
            }else {
                System.out.println("Geçersiz sifre");
            }

        }else {
            System.out.println("Lütfen ilk karakter için sadece harf kullanın.");
        }


    }
}
