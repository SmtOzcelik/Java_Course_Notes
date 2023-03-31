package day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(5,7);//12
        topla(5.2,3);// 8.2
        topla(5,6.2);// 1. ve 2. method lara sigmadi 3 oldu ye uygun oldu ve calisti

    /* java hangi metodun calisacagına karar verirken optimasyon yapar.
     -eğer hic cast yapmadan kullanabileceği bir metod varsa onu kullanir
     - eger cast yapmadan kullanacağı bir method yoksa, en az cast yaparak kullanabileceği
       methodu tercih eder.
     */
    }
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integer in toplamı:"+(sayi1+sayi2));
    }

    public static void topla(double sayi1,int sayi2){
        System.out.println("bir double ve bir integer in toplamı:"+(sayi1+sayi2));
    }

    public static void topla(double sayi1,double sayi2){
        System.out.println("iki double in toplamı:"+(sayi1+sayi2));
    }
    // parametre 3 e cıkarsa da metod farklılasır
}
