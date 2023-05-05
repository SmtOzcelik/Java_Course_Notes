package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {

        /*
        split() bir array methodu degil, String metodudur.
        ama array donudurdugu için bu konuda anlatıyoruz.

        split() ile herhangi bir String i istediğimiz sekilde parcalara bölüp
        bir array haline getiriyoruz
        */


        // kelime kelime ayirmak için " " yazıp bulup ordan keser
        String str="java ne kadar guzel";
        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        // ne bul ayir ne yi de yok eder
        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        // e bul ayir e yi de yok eder
        String[] kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE));

        // "" hiçlik ile ayiralim
        String[] karakter=str.split("");
        System.out.println(Arrays.toString(karakter));





    }
}
