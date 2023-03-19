package day08_IfStatemens;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden not isteyin.Notu harf sistemine çevirip yazın.
        50 den küçükse "D", 50 ile 60 arası "C", 60 ile 80 arası "B",80 ile 100 arası "A" yazdır.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aldığınız notu girin.");

        double not=scan.nextDouble();
        if(not>0 && not<50){
            System.out.println("Notunuz D");}else if (not>=50 && not<60){
            System.out.println("Notunuz C");}else if (not>=60 && not<80){
            System.out.println("Notunuz B");} else if(not>=80 && not<=100){
            System.out.println("Notunuz A");} else {
            System.out.println("Lütfen notunuzu düzgün girin.");}
    }
}
