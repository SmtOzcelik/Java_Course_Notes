package day07_Ifstatemens;

import java.util.Scanner;

public class C08_SoruCozum {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını istiyin
        kare mi dikdörtgen olduğunu yazdırınız.
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen uzun kenarı giriniz.");
        int uzunkenar=scan.nextInt();
        System.out.println("lütfen kisa kenarı giriniz.");
        int kisakenar=scan.nextInt();
        if(uzunkenar==kisakenar){
            System.out.println("Verilen bilgileri göre şekil karedir.");}
        else {
            System.out.println("Verilen bilgire göre şekil dikdörgendir.");}


    }
}
