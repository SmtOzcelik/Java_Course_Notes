package day04_dataCasting;

public class C05_pre_post {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=sayi1+1;// sayi2-->11

        // pre veya posti increment veya decrement
        //sadece ++ ve -- için geçerlidir.
        //bu 2 işlem sayıdan önce veya sonra yazılmasında farklı 2 işleyiş olur.

        int sayi3=sayi2++;// 1- sayi2 değiri 1 artırılacak
                           // 2-sayi2 sayi3 e atanacak.

        int sayi4=++sayi1; // 1- sayi1 değeri 1 artır.
                            // 2- sayi1 değeri sayı4 e atanacak


    }
}
