package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan toplanmak uzere sayilar alin.sayilarin
        toplami 500 u gecince sayilarin toplamı ve kac sayi toplanidiğini
        su sekilde yazdirin
        13 sayi girdiniz ve toplamaliri 567
        */

        int toplam=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);

        while (toplam<500){
            System.out.println("Lütfen toplamak icin sayi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println(sayac+" sayi girdiniz ve toplalari="+toplam);
    }
}
