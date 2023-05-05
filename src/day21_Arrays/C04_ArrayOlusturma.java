package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlusturma {
    public static void main(String[] args) {

        // kullanıcıdan bir array in boyutunu ve tum elementlerini alarak
        // bir array oluşturup,bu array in bize donuduren bir method oluşturun.

        int[] sayilar=arrayOlustur();
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac elemanli bir array oluşturmamı istersiniz");
        int uzunluk=scan.nextInt();
        int[] olusturulan=new int[uzunluk];

               for (int i = 0; i < uzunluk; i++) {
            System.out.println(i+". index icin sayi giriniz");
            olusturulan[i]=scan.nextInt();

        }


    return olusturulan;
    }
}
