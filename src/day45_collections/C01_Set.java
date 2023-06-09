package day45_collections;

import java.util.*;

public class C01_Set {
    public static void main(String[] args) {

        // verilen bir array deki tekrar eden elementleri silip tekrarsız
        // halini array e atayan bir kod yaziniz

        int[]arr={4,5,3,6,8,5,1,9,0,4,2,5,7,10,1,2,5,7,6};

        //array i set e aktaralim ki tekrarsız ozelligini kullanalim
        Set<Integer>tekrarsizSet=new HashSet<>();

        for (int w:arr
             ) {
            tekrarsizSet.add(w);
        }

        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        int[] tekrarsizArr=new int[tekrarsizSet.size()];

        int i=0;
        for (Integer each:tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }
        arr=tekrarsizArr;
        System.out.println("Bizim array in son hali : "+Arrays.toString(arr));

    }
}
