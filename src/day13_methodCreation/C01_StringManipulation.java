package day13_methodCreation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        /*
        String şeklinde verilen asagıdaki fiyatların toplamını bulunuz.
        String str1="€13.99"
        String str2="€10.55"
        ipucu: Double.parseDouble() methodunu kullanabiliriz.
        */

        String str1="€13.99";
        String str2="€10.55";
        str1=str1.replaceAll("\\D","");// sayılar haric hepsini boşluk yap 1399
        double sayi1=Double.parseDouble(str1); // string bir veriyi double cevirme kodu 1399.0 oldu
                                                // Wrapper Class yöntem
        str2=str2.replaceAll("\\D",""); // sayılara haric hepsini bosluk yap 1055
        double sayi2=Double.parseDouble(str2); // 1055.0 oldu
        System.out.println("€"+(sayi1+sayi2)/100); // 100 e böldük ki , sonrası olsun.. €24.54


    }
}
