package day03_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {

        //kişinin ad soyad yas tc aks iste
        //ad,soyadı,yas,tc ve aks 2. harf büyük yazdır.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adınızı yazınız.");
        String ad=scan.nextLine();
        System.out.println("lütfen soyadınızı yazınız");
        String soyadı=scan.nextLine();
        System.out.println("Lütfen yaşınızı yazınız");
        long yas=scan.nextLong();
        System.out.println("lütfen TC nizi giriniz");
        double tc=scan.nextDouble();
        System.out.println("Lütfen anne kızlık soyadını yazınız");
        char aks=scan.next().toUpperCase().charAt(1);
        System.out.println("Kişi bilgileri="+ad+","+soyadı+","+yas+","+tc);
        System.out.println("anne kızlık soyadı 2. harfi="+aks);

    }
}
