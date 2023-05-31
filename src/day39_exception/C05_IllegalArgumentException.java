package day39_exception;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        // Soru:Kullacinidan yasini girmesini isteyin.Kodunuzu kullanici
        // sifirdan kucuk bir sayi girerse Exception verecek sekilde yaziniz

        Scanner scan =new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        try {
            if(yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("Yasiniz : "+yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Yas negatif olamaz");
        }

    }


}
