package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        // bir listedeki elementleri iterator kullanarak sondan basa dogru sirala

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        // sondan basa gelebilmek icin once sona gitmek lazim
        System.out.println(list);//[2, 13, 56, 23, 45, 14, 40]

        ListIterator li1=list.listIterator();

        while (li1.hasNext()){ // ileri eleman bitene kadar git
            li1.next();// sona kadar tek tek gittik ama yazdırmadik
        }// bu loop bizi sona goturur. iterator sonda su an

        while (li1.hasPrevious()){//geri eleman bitene kadar git
            System.out.print(li1.previous()+" "); // 40 14 45 23 56 13 2
        }
    }
}
