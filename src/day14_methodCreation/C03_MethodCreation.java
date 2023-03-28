package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // Input olarak verilen isim ve soyismi
        // ilk harfi büyük geriye kalan harfler * olacak şekilde
        // I**** K**** şeklinde yazdıran bir metod oluşturun.

        String isim="Enes";        // isim ve soyismi verilir.
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim);// kendimiz method ismini oluşturduk.ve içine inputları koyduk
                                // ilk kırmızı çıkar ki uyarıdır boyle bi method yok ya sen aşagıda
                                // tanımla yada ben otomatik aşağı atayım diye sorar.




    }

    public static void ismiGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+soyisim);
    }
}
