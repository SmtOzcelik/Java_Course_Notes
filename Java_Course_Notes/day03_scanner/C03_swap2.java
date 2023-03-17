package day03_scanner;

public class C03_swap2 {
    public static void main(String[] args) {

        //sayi1=10 ve sayi2=20 programla ve değerlerini değiştir sonuç sayi1=20 ve sayi2=10 yap
        // bir önce ki soruyu 3. kova kullanmadan yapınız.

        int sayi1=10;
        int sayi2=20;

        sayi1=sayi1+sayi2;
                sayi2=sayi1-sayi2;
                sayi1=sayi1-sayi2;

                System.out.println("swap den sonra sayi1=" + sayi1);
                System.out.println("swap den sonra sayi2=" + sayi2);

    }
}
