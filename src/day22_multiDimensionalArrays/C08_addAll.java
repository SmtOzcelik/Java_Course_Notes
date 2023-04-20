package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_addAll {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<Integer>sayilar2=new ArrayList<>();
        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(16);
        sayilar2.add(20);

        sayilar1.addAll(sayilar2);// sayilar1 in icine sayilar2 yi ekledik.
        System.out.println(sayilar1);//[5, 3, 2, 10, 15, 16, 20]

        sayilar1.addAll(1,sayilar2);// sayilar1 e 1. indeksden sonra sayilar2 yi ekle
        System.out.println(sayilar1);//[5, 10, 15, 16, 20, 3, 2, 10, 15, 16, 20]
        // bir listenin sonuna veya istediğimiz bir indexsine baska bir
        // collection ekleyebiliriz
    }
}
