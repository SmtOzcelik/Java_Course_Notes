package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class C01_ListIterator {
    public static void main(String[] args) {

        /*
        bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
        yaziniz.
        orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi sinirlar dahil
        output : [23,40]
         */

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        System.out.println(list);//[2, 13, 56, 23, 45, 14, 40]

        Iterator it1=list.iterator();
        int bas=20;
        int son=40;
       while (it1.hasNext()){
           Integer temp=(Integer) it1.next(); //it1 object oldugu icin Integer kullandik

           if(temp<bas || temp>son ){
               it1.remove();
           }
       }
        System.out.println(list);
    }

}
