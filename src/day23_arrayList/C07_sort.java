package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        // ürünleri sıralar fakat bize bir şey dönmez.
        System.out.println(urunler);//[Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort methodu nda siralama özelliğini girmek
        gerekir. bunun yerine Collections class ından sort metodunu
        kullaniyoruz. bu method listemizi natural(normal) order a gere siraler
        */

    }
}
