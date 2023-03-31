package day15_overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5,7);//12
        topla(5.2,3);// 8.2 yazmıs oldugumuz 4 metod a cıkıyor ya biz tercih edecegiz yada
                      // otomatik kendisi alir. bir double bir integer i aldı.
    }
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integer in toplamı:"+(sayi1+sayi2));
    }
    /* bir class da parametre sayisi ve parametre data türleri aynı olan 2 method
    oluşturamayiz.asagıda ki örnegi kabul etmedi zaten yukarıda var diye

    public static void topla(int sayi3,int sayi4){
        System.out.println("iki integer in toplamı:"+(sayi1+sayi2)); */


    public static void topla(double sayi1,int sayi2){
        System.out.println("bir double ve bir integer in toplamı:"+(sayi1+sayi2));
    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("bir integer in ve bir double toplamı:"+(sayi1+sayi2));
    }
    public static void topla(double sayi1,double sayi2){
        System.out.println("iki double in toplamı:"+(sayi1+sayi2));
    }
}
