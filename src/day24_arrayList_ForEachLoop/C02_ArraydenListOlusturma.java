package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {

        /*
        içinde 200 tane 1000 den kucuk pozitif tamsayi olusturun.
        kullanıcıdan bir sayi isteyip listede var olup olmadıgıni kullanıcıya yazin
        */

        Random rnd=new Random(); // sayi üretme kodu
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while(sayiListesi.size()<200){
            sayi= rnd.nextInt(1000); // 1000 den kucuk sayi uretiyor
            if(!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);

            }
        }
        System.out.println(sayiListesi);// kafasina göre ürettigi sayilari yazdirdi

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);
        while (!bildiMi){
            System.out.println("Lütfen bir sayi tahmininde bulunun");
            sayi=scan.nextInt();
            if(sayiListesi.contains(sayi)){
                System.out.println("tebrikler " + tahminSayisi+" adet tahminde listeden bir sayi buldunz");
                bildiMi=true;
            }else {
                System.out.println(tahminSayisi+" adet sayi söylediniz hic biri listede yok");
                tahminSayisi++;
            }
        }

    }
}
