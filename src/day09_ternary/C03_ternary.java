package day09_ternary;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir sayi isteryin sayi pozitif ise sayıyı yazdırın.
        // sayi negatifse, bir sayi daha isteyin ve ikisinin çarpımını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        double sayi1=scan.nextDouble();
        if(sayi1>0){
            System.out.println(sayi1);
        }else{
            System.out.println("Lütfen bir sayı daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi1*sayi2);
            // not: if else de içerisinde yeni kodlar varsa
            //ternary ile yapmamız mümkün olmaz.
        }
    }
}
