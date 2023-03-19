package day08_IfStatemens;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        /*
        Emeklilik kontolü yapan bir program yazınız. cinsiyet olarak E erkek K kadın
        değişkenlerini kabul etsin.farklı bir harf veya sembol girilirse hata mesajı versin
        emeklilik kadınlarda yaş sınırı 60, erkeklerde 65 olsun. Negatif yaş olarak da 80 den
        fazla girilirse hata mesajı versin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen  Kadın K ve Erkek E tuşlayın");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz.");
        double yas=scan.nextDouble();
        if(cinsiyet=='E') {
            if(yas<0 || yas>80){
                System.out.println("Lütfen geçerli yaş giriniz.");}
            else if(yas<65){
                System.out.println("Emekli olamazsın.");} else {
                System.out.println("Emekli olabilirsin.");}}

            else if (cinsiyet=='K'){if(yas<0 || yas>80){
            System.out.println("Lütfen geçerli yaş giriniz.");}
        else if(yas<60){
            System.out.println("Emekli olamazsın.");} else {
            System.out.println("Emekli olabilirsin.");}}
         else{
            System.out.println("Lütfen düzgün tuşlama yapınız.");}}}

