package day06_concanation;

public class C02_Concanation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzeldir";

        int sayi1=5;
        int sayi2=4;

        // Java Güzeldir 54 nasıl yazdırılır.
        System.out.println(str1+" "+str2+" "+sayi1+sayi2);

        // Java Güzeldir 9 nasıl yazdırılır
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));

        // 9 Java nasıl yazdırılır
        System.out.println(sayi1+sayi2+" "+str1); // sayi1+sayi2 paranteze almadık çünkü toplama soldan başlar

        // 54 Güzeldir nasıl yazdırılır.
        System.out.println(" "+sayi1+sayi2+" "+str2);// " " kullanarak hiçlik ekledik.hiç string oldu
                                                    // string den sonra da sayılarıda toplayamadı.

        //JavaGüzeldir i + kullanmadan, string in metodu olana concat ile yazdır.
        System.out.println(str1.concat(str2));
        // Java Güzeldir i + kullanmadan, string in metodu olan concat ile yazdır.
        System.out.println(str1.concat(" ").concat(str2));
    }
}
