package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
        Binary search metodu siralanmis array de aradiğimiz elementin index ini donudurur

        Ya aradığımız array de yoksa ?
        (String de indeksof bize olmayan elemetler icin -1 donduruyordu.

        Ardıgımız element array da yoksa java hem olmadiğini hem de olsaydi
        nerede olacağını bize donudurur.

        olmadığını ifade icin - kullanır
         olsaydi nerede olacağını belirtmek için index değil sıralama kullanır.*/

        int[] sayilar={3,7,15,4,27,10};
        Arrays.sort(sayilar);// siraladik
        System.out.println(Arrays.toString(sayilar));//[3, 4, 7, 10, 15, 27]
        //varsa index,yoksa -sira

        System.out.println(Arrays.binarySearch(sayilar,4));// 1 (indeks no)

        System.out.println(Arrays.binarySearch(sayilar,15));//4

        System.out.println(Arrays.binarySearch(sayilar,11));// -5 eksi olmasi yok demek
        // fakat sayiyi 5 i vermesi 11 olsaydi siralamada nerede olacağını belirtir.


        System.out.println(Arrays.binarySearch(sayilar,6));

        System.out.println(Arrays.binarySearch(sayilar,-100));

    }
}
