package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram")); //1
        System.out.println(urunler);

        /*
        indexOf metodu bize bilgi donduren bir method dur. listemizi degistirmez
        */

        System.out.println(urunler.lastIndexOf("Ikram"));//1

        /*
        indexOf methodu urunu aramaya 0. index den,
        lastIndexOf methodu ise aramaya son indexden baslar

        arama bitip bakildiğinda ikiside ayni index i verir.
        */

        urunler.add("Ikram");
        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler.lastIndexOf("Ikram"));//4  sondan say ilk ikram bul

        System.out.println(urunler.indexOf("hobby"));//-1

    }
}
