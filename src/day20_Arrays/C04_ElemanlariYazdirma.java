package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};

        // array in hepsini yazdiralim.
        System.out.println(Arrays.toString(sayilar));//[1,2,3,4,5,6,7]

        // array in tüm elementlerini yazdiralim.

        for (int i = 0; i <sayilar.length ; i++) {
            System.out.print(sayilar[i]+" ");

        }


    }
}
