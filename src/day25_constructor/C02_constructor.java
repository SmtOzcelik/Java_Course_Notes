package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_constructor {
    public static void main(String[] args) {

             C01        obje1    =   new          C01()      ;
        // class adi  objenin adi   keyword    CONSTRUCTOR

        //Benzer constructor lar hep obje oluşturduk
        Scanner scan = new Scanner(System.in);
        Random rnd =new Random();
        List<String> list=new ArrayList<>();

        /*
        java da bir obje oluşturabilmek için mutlaka constructor kullanmalisiniz.
         */

        System.out.println(obje1.sayi); //0 değer vermediginde int de "0"
        obje1.deneme();// C01 den deneme method calişir
    }
}
