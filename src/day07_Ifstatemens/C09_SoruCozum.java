package day07_Ifstatemens;

import java.util.Scanner;

public class C09_SoruCozum {
    public static void main(String[] args) {

        /*
        Kullanıcıdan sayı isteyin tek mi çift olduğuna bakin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi=scan.nextInt();
        if(sayi%2==0){
            System.out.println("Verilen sayı çifttir.");} else {
            System.out.println("verilen sayi tektir.");}


    }
}
