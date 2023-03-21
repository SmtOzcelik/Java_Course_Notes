package day10_StringManipulation;

public class C05_lenght {
    public static void main(String[] args) {

        String str ="Java ogren, isi kap";

        System.out.println(str.length()); // 19 str nin karakter sayisini döndürür.

        // son karakteri yazdıralim
        System.out.println(str.charAt(str.length()-1)); // p

        // sondan 3. karakteri yazdıralim
        System.out.println(str.charAt(str.length()-3)); // k

        /*
        javada null pointer (işaretleyici) bir değer değil,karşısına yazıldığı
        variable in hiç bir deger almadığının işaretcisidi.
         */

        String str2=""; // str2 ye bir değer atanmış mıdır EVET
                        // Bu değer nedir: HİÇLİK
        System.out.println(str2.length());// 0 yazdırır.

        String str3=null; // str3 e bir değer atanmamıştır. HAYIR
                          // null bu değer atamamayı işatet etmektedir.

        System.out.println(str3.length()); // bir değer atanmamış ki nasil uzunluğu olsun ?
                                           // .NullPointerException olarak hata verir.
}}
