package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*
        Tek katli arraylerde array i direk yazdiramiyoruz cünkü array
        non-pirimitive data turudur ve her non-pirimitive data direk yazdirilamayabilir

        Ancak array in icerisindeki elementleri direk yazdirabiliyorduk.cunku genelde
        pirimitive data türü veya string elementler kullanilyordu.

        multi-dimensional arraylerde en dikkat edecegimiz konu ulaşmak istedigimiz
        elementin bir array mi yoksa pirimitive data mi oluduğudur.    */

        int[][] sayilar={{1,2,4,5},{3,4}};

        /*
        burada sayilar array ini dusunursek 2 tane inner array var
        sayilar [0]---> [1,2,3,4]

        Ancak en icerdeki elementere ulaşirsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]);// [I@511d50c0 referans veriyor direk yazdiramadik
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));//[[I@511d50c0, [I@60e53b93]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]
        // katli coklu array lerde yazdirma metodu Arrays.deepToString() kullanilir.

        /*
        array i 2 şekilde declare edebiliyorduk
        1-elemanleri direk yazabiliriz.
        int[][] sayilar={{1,2,4,5},{3,4}};
        2- outer ve inner arrayleri uzunluklarini belirterek oluşturabiliriz
        int[][] sayilar=new int[3][4];

        ancak 2. yöntemle yaptigimizda inne array lerin uzunlukta olma ihtimali kalmaz
        bu örnek icin outer array in 3  tane inner array i vardir.
        her bir inner array in ise 4 er elemani vardir.

        eger inner array leri farkli uzunluklarda oluşturmak istiyorsaniz
        mecbur 1. yöntemi kullaniriz.

         */
    }
}
