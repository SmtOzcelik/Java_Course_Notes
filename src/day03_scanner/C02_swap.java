package day03_scanner;

public class C02_swap {
    public static void main(String[] args) {
        /*
        sayi1=10 ve sayi2=20 programla ve değerlerini değiştir.
        sonuç sayi1=20 ve sayi2=10 yap
        */

        int sayi1=10,sayi2=20,sayi3; // hayali sayi3 veriable yap ondan ona aktarak devam et

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;

        // " birşeylar yaz " + koy veriable yaz görüntü gezel olur
        System.out.println("swap dan sonra sayi1="+sayi1); // görüntü swap dan sonra sayi1=20
        System.out.println("swap dan sonra sayi2="+sayi2); // görüntü swap dan sonra sayi2"10

    }
}
