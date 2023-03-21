package day10_StringManipulation;

import java.util.Locale;

public class C02_toLowercase_toUpperCase {
    public static void main(String[] args) {

        String str ="Beni psikopata bağlamayin";
        System.out.println(str.toUpperCase()); //BENI PSIKOPATA BAGLAMAYIN yazdırır.
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // BENİ PSİKOPATA BAĞLAMAYİN
        // Eğer büyük küçük harf dönüşümünde local bir dili esas almak isterseniz bu medod kullanılır.
    }
}
