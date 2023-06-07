package day43_interface_iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer>liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);//[10, 20, 30]
        //liste deki tum elementleri INDEX KULLANMADAN 3 ARTIRIN.
        for (Integer  w:liste
             ) {
            w +=3;
            System.out.print(w +" ");//13 23 33

        }
        System.out.println("");
        System.out.println(liste);//[10, 20, 30] ama liste degismedi

        /*
        Java index yapisi olmayan collection lardaki elementlere ulasmak veya
        degistirmek icin Iterator interface ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir.
        Bunun yerine bize iterator döndüren liste.iterator() methodunu kullaniriz
         */
        System.out.println(liste);//[10, 20, 30]
        Iterator it1=liste.iterator();
        // 3 methodu var next() hasnext() remove()

        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30

        // Iterator da geri donus yok ,adim adim sona ulastiktan sonra basa dönmek icin
        //yeniden bir iterator olusturmaniz gerekir.

        //[10, 20, 30]
        Iterator it2=liste.iterator();
        // yeni it2 kullanarak listenin tum elementelerin silerim
        // silmek icin önce next ile alacak sonra silecek

        it2.next();//doldur
        it2.remove();//sil
        System.out.println(liste);//[20, 30]
        it2.next();
        it2.remove();
        System.out.println(liste);//[30]
        it2.next();
        it2.remove();
        System.out.println(liste);//[]
        // iterator ile elementleri gezip remove yapinca liste kalici olarak degisti

        // liste yi yeniden dolduralim
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste ;"+liste);

        Iterator it3=liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop dan sonra liste: "+liste);//[]
        /*
        Gouruldugu gibi Iterator kullanarak yapabildigim
        1- tum collection elementlerini yazdirmak
        2- tum  collection elementlerini silmek
        Bu da bize yetmez
         */

    }
}
