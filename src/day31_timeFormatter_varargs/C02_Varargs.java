package day31_timeFormatter_varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        // verilen iki int i toplayip sonucu yazdiran bir method olusturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("verilen 4 sayinin toplami = "+(sayi1+sayi2+sayi3+sayi4));
    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println("verilen 3 sayinin toplami = "+(sayi1+sayi2+sayi3));
    }

    public static void toplaYazdir(int sayi1, int sayi2) {

        System.out.println("verilen 2 sayinin toplami = "+(sayi1+sayi2));

        // boyle farkli sayida paremetreler icin yeni methodlar olustrumak
        //yerine java varargs gelistirmistir bak C03 e
    }
}
