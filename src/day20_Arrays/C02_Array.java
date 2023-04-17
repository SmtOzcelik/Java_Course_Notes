package day20_Arrays;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        int sayilar[]=new int[3];
        System.out.println(sayilar); //[I@511d50c0 refarans verdi
        // non primitive data turundeki datalari her zaman direk yazdiramayabiliriz.
        //arrayi yazdırmak istersek Arrays class indan yardim isteriz
        // toString() metodu kullaniriz

        System.out.println(Arrays.toString(sayilar)); // [0,0,0]

        // deger atayalim.
        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(sayilar);//[I@511d50c0  deger de versek yazdirmak için toString kullan
        System.out.println(Arrays.toString(sayilar));// [5,3,10] indeks sırasina göre sıralandı

        String sinifList[]={"ali","ayse","ahmet"};
        System.out.println(Arrays.toString(sinifList));// [ali,ayşe,ahmet]

        sinifList[1]="hasan"; // 1. indekse hasan atadık ama lenght() hic zaman degişmez
        System.out.println(Arrays.toString(sinifList)); // [ali,hasan,ahmet]
        // array in hepsin yazdırırken toString() kullanılir

        System.out.println(sinifList[1]);// hasan i yazdiralim
        System.out.println(sinifList[0]);// ali yi yazdiralim






    }
}
