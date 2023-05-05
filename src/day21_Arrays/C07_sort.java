package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int[] sayilar={5,7,1,6,7,4,3,9};

        // Array i Arrays class ini kullanarak sirali hale getirebilir.

        Arrays.sort(sayilar);// sayilar i Arrays.sort siraladik.14 e yakin sort var parametre türüne göre secer

        System.out.println(Arrays.toString(sayilar));

    }
}
