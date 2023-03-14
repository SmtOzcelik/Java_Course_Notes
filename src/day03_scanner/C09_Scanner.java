package day03_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        //kişiden ad,soyad,yaş ve anne kızlık soyadı iste.
        //kişinin adını soyadını yaşını ve aks 3.harfini büyük harfle yazdır.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ad soyad,yas ve aks enter e basarak yazdırın");
        String ad=scan.nextLine();
        String soyadı=scan.nextLine();
        int yas=scan.nextInt();
        String aks=scan.nextLine();
        char ucuncuharf=scan.next().toUpperCase().charAt(2);
        System.out.println("adı soyadı="+ad+" "+soyadı);
        System.out.println("anne kızlık soyadı ucuncuharf="+ucuncuharf);
    }
}
