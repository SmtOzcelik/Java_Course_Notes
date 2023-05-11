package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove methodu 2 sekilde kullanilir.
        1- objeyi yazip silmesini istersek bize boolean sonuc döner true/false
        2-index girersek o index deki elamani siler ve bize silineni döndürür.
        */

        System.out.println(urunler);// [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram")); // true (sildim diyor)
        System.out.println(urunler);// [Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby"));// false (yok ki silsin)
        System.out.println(urunler);// [Nutella, Cekirdek, Cay]

        // 2. yöntemi deneyelim yani index girelim
        System.out.println(urunler.remove(1));// Cekirdek (sildi ve sildiğini dondurdu)
        System.out.println(urunler);//[Nutella, Cay]

        // olmayan bir indexs i silmeye çalışırsak "run time error" verir
        System.out.println(urunler.indexOf(4));// run time error

    }
}
