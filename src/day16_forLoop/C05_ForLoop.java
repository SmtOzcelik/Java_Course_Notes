package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Kullanıcıdan 2 sayi isteyin. girilen sayilar ve aralarındaki
        // tum sayilari toplayip,sonucu yazdiran medhod  program yaziniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi giriniz");
        int bas=scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz");
        int bitis=scan.nextInt();

        aralaritopla(bas,bitis);
    }
    public static void aralaritopla(int bas,int bitis){
        int toplam=0;
        if(bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
                toplam=toplam+i;

            }
        }else {
            for (int i = bitis; i <=bas ; i++) {
                toplam=toplam+i;

            }
        }
        System.out.println("Aralarindaki sayilarin toplami="+toplam);
    }

}
