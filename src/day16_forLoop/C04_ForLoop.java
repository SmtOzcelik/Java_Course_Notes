package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 100 den kucuk sayi isteyin.
        1'den baslayarak girilen sayiya kadar tum sayiları yazdirın. ancak;
        -- Sayi 3 ün kati ise sayi yerine "Java" yazdirin.
        -- sayi 5 in kati ise sayi yerine "Guzeldir" yazdirin
        -- sayi hem 3 un hem 5 in kati ise sayi yerine "Java Guzeldir" yazdır
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 100 den kucuk sayi giriniz");
        int sayi=scan.nextInt();

        if(sayi<100){
            for (int i = 1; i <=sayi ; i++) {
                if(i%15==0){
                    System.out.println("Java Guzeldir");
                } else if (i%5==0) {
                    System.out.println("Guzeldir");
                }else if(i%3==0){
                    System.out.println("Java");
                }else {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Lutfen 100 den kucuk sayi girin");
        }
    }
}
