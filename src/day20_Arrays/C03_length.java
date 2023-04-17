package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        // iki şekilde array oluşturulur.

        int sayilar[]={1,2,3}; // direk atama yaparak bu şekilde süslü parantez

        String harfler[]=new String[4];//uzunluk olarak da bu şekilde oluşturulur.

        System.out.println("sayilar array in uzunluğunu ; "+sayilar.length);// 3
        // String lenght() method unda parantez var, ARRAY da YOK..
        System.out.println("harfler array uzunluğu : "+harfler.length);// 4
        System.out.println(Arrays.toString(harfler));//[null, null, null, null]

        //harfler array in son elentini yazdiralim
        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException hata verir 5. indeks yok

    }
}
