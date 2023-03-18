package day07_Ifstatemens;

import java.util.Scanner;

public class C05_IfelseStatement {
    public static void main(String[] args) {

        // soru: kullanıcadan bir karakter girilmesini isteyin
        // harf olup olmadığını yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz.");
        char harf=scan.next().charAt(0);
        if((harf>='a'&& harf<='z')||(harf>='A'&& harf<='Z'))
        { System.out.println("Girilen karakter harftir.");}else {
            System.out.println("Girilen karakter harf değildir.");}
        }

}
