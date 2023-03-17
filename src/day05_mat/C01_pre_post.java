package day05_mat;

public class C01_pre_post {
    public static void main(String[] args) {

        int sayi1=11;
        int sayi2=sayi1+5;// sayi2-->16

        // pre veya posti increment veya decrement
        //sadece ++ ve -- için geçerlidir.
        //bu 2 işlem sayıdan önce veya sonra yazılmasında farklı 2 işleyiş olur..

        int sayi3=sayi2++;// 1- sayi2 sayi3 e ata sayi3=16
                           // 2-sayi2 bir artır sayi2=17

        System.out.println("sayi3="+sayi3);

        int sayi4=++sayi1; // 1- sayi1 değeri 1 artır. sayi1=12
                            // 2- sayi1 değeri sayı4 e atanacak sayi4=12

        System.out.println("sayi4="+sayi4);
        System.out.println("sayi1="+sayi1);
        System.out.println("sayi2="+sayi2);


    }
}
