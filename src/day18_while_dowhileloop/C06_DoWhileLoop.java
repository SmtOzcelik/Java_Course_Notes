package day18_while_dowhileloop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0'a basmasini soyleyin.
        Kullanıcı yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve "Negatif sayi giremezsiniz" yazdirip basa donun.
        Kullanıcı 0'a bastiginda toplam kac pozitif sayi girdiğini,
        yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
        toplaminin kac oldugunu yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayilarTop=0;

        do {
            System.out.println("Lütfen toplamak uzere pozitif tam sayi giriniz");
            sayi=scan.nextInt();
            if(sayi>0){
                pozSayilarTop+=sayi;
                pozSayiAdedi++;
            }else if (sayi<0){
                negSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }

        }while (sayi!=0);
        System.out.println(pozSayiAdedi +" adet pozitif sayi girdiniz, toplamlari : " + pozSayilarTop);
        System.out.println(negSayiAdedi + " adet negatif sayi girdiniz ancak toplamlarini almadik");

    }
}
