package day28_statickBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        static block class uyelerinin tamamından önce calişir(main method dan bile önce)
        static block class olusturuldugunda calisir genellikle class ile ilgili ön
        ayarlamalar veya static variable lara deger atamak icin kullanilir.

        static block larin class icerisinde nerede oldugu önemli degildir.
        önce static blocklar calişir

        birden fazla static block varsa yukaridan asagi dogru calişir
         */
        System.out.println("static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);

    }
    static {
        System.out.println("main method altindaki static block calisti");
    }
}
