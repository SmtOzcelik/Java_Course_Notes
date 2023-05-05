package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /*
        Binary Search javada eleman aramanin kisa yoludur.
        Ancak binary searc un calismasi icin once array i sirali hale getir.
        eger siralema yapmadan binary search yapilirsa sonucu bulamayabilir veya
        yanlis bulabilir
        */

        String[] harfler={"Y","B","D","G","O"};

        String arananHarf="Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf)); // negatif sayi cıkarsa bulamadi
        // binary search bize aradigimiz elemanin index ini dondurur.
        // array sirali olmadiği icin arama sonucu dogru bulamayabilir
        // emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));// yeni siralanmiş hali
        System.out.println(Arrays.binarySearch(harfler,arananHarf));



    }

}
