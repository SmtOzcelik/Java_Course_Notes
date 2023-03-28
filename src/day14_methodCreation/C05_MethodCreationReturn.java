package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {

        // kullanıcıdan şehir ismini ve doğum tarihini alın.
        //bunları programda kullanacağımız formatta bize döndüren method oluşturun.
        // şehir ismini programımızda
        // büyük harf olarak,tarihi ise 2022-06-30 şeklinde kullanmak istiyoruz

        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("Girdiginiz sehir:"+sehir);
        System.out.println("Giridiginiz tarih:"+tarih);


    }

    public static String tarihAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz");
        String tarih="";
        int yil=scan.nextInt();
        if(yil>1900 && yil<2100){
            tarih=yil+"-";
        }else {
            System.out.println("Lütfen geçerli(1900-2100) yil girin");
        }
        System.out.println("kacıncı ay oldugunu tam sayi olarak yazınız");
        int ay=scan.nextInt();
        if(ay<0 || ay>12){
            System.out.println("ay no 1-12 arasında olmalıdır");
        } else if (ay>0 && ay<10 ) {
            tarih=tarih+"0"+ay+"-";

        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("lütfen gun giriniz");
        int gun=scan.nextInt();
        if(gun<=0 || gun>31){
            System.out.println("lutfen düzgün(1-31) gun no girin ");
        }else if(gun<10) {
            tarih=tarih+"0"+gun;

        }else {
            tarih=tarih+gun;
        }
        return tarih;
    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sehir ismi giriniz");
        String sehir=scan.next().toUpperCase();
        return sehir;
    }
}