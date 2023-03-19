package day08_IfStatemens;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 4 basamaklı sayı girmesini isteyin.
        girilen sayı 5 e bölünüyorsa son rakamını kontrol edin.
        son rakamı 0 ise "5 e bölününen çift sayı" yazdırın.
        son rakamı 5 ise "5 e bölünen tek sayı" yazdırın.
        girdiği sayı 5 e bölünmüyor ise "tekrar sayı yazdırın"
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı girin.");
        int sayi=scan.nextInt();
        if (sayi<1000 || sayi>9999) {
            System.out.println("Lütfen 4 basamaklı sayı girin.");}
        else if(sayi%5==0) {
            if(sayi%10==0){
                System.out.println("Sayı 4 basamaklı çift");}
            else {
                System.out.println("Sayı 4 basamaklı tek");}}
        else {
            System.out.println("Lütfen tekrar deneyin.");}


        }
    }

