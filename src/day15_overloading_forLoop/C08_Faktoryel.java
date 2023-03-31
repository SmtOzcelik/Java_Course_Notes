package day15_overloading_forLoop;

public class C08_Faktoryel {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tamsayi icin faktoryel hesapliyip yazdiran
        bir metod olusturun.
        Verilen sayi negatif veya 20 den buyuk olursa
        "girilen sayinin faktoryeli hesaplanamaz" uyarisi yazdirin.
         */

        int input=5;
        faktoryelHesapla(input);
    }

    public static void faktoryelHesapla(int input) {
        int faktoryel=1;
        if(input<0 || input>20){
            System.out.println("verilen sayi icin faktoryel hesaplanamaz");
        } else if (input==0) {
            System.out.println("0!=1 dir");
        }else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;
            }
            System.out.println("faktoryel degeri ="+faktoryel);
        }
    }
}
