package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        // verilen kac int olursa olsun hepsini sonucu yazdiran method yap

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
        // ... varargs yontemi ile asagıda hepsini halletti
    }
    public static void toplaYazdir(int... sayi){
        /*
        int... sayi bu gösterim int lerden olusan bir varargs demektir.
        varargs array alt yapisini kullanir.
        */
        int toplam=0;
        for (int each: sayi
             ) {
            toplam+=each;

        }
        System.out.println("girilen sayilarin toplami = "+toplam);

    }

}
