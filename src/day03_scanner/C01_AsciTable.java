package day03_scanner;

public class C01_AsciTable {
    public static void main(String[] args) {

        // Bir tamsayı bir char ve String birlikte toplama yaptrırın.

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.printf("sayi+harf");  // sayi+harf  tırnak içinde olduğu için

        System.out.println(str+harf); //banana çünkü String çok güçlü char ı kendine çevirdi
        System.out.println(str+sayi);  // banan10 çünkü string çok güçlü int kendine çevirdi
        System.out.println(harf+2); //97 char matetiksel ifade ye geçti Aski tablosun göre

        // aski tablosuna göre 'A'=65 'a'=97 '1'=49 gibi değerler var burdan beslenir
        System.out.println(sayi+15); //25 int kendisi direk topladı
        System.out.println(str+sayi+harf);// banan10a String çok güçlü kendine benzetti
        System.out.println(""+sayi+harf); // 10a oldu çonkü "" işareti String leşti diğerlerini de kendine benzetti
        System.out.println("AT"+sayi+harf);//AT10a çıktı String ağrı bastı.



    }
}
