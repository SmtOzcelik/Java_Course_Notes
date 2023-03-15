package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        char harf='a';
        // char yeniharf=harf+1; şeklinde sonuç çıkmaz çünkü aski değiri 97+1=98 çıkar
        // bu da tek karakter olmadığı için hata veriyor. o yüzden = sonrasın (char)(harf+1) şeklinde yazılıp
        // ascii de tek karakter bulunur

        char yeniHarf=(char)(harf+1);
        System.out.println(yeniHarf);

        // bazen data türü varable dışında atanabilir
        // bunları java otomatik kabul edebilir
        // java eğer bu değer atamasına sorun oluşacağın
        // data kayıplarının oluşabileceği veya javanın başkalaşabileceği görürse
        // bu durumda otomatik olarak bu atamayı kabul etmez
        // sizden bu atamayı istiyorsanız sorumluluğu almanızı bekler.

        int sayi1=(int)7.3;  // int için 7,3 olmaz double olması lazım ama = sonrası (int) yapınca kabul etti.
        double sayi2=10;
        int sayi3='c';  // normalde char ile yazılması lazım fakat data casting den dolayı değişebiliyor
        char harf2=98; // char tek karakter olacağından dolayı kabul etmemesi gereki. casting oldu

        // bakalım yazdırdığımız da sonuç verecek mi
        System.out.println("sayı1="+sayi1); // 7 küsüratı atar.yedi olarak işlem yapar
        System.out.println("sayi2="+sayi2); // 10,0
        System.out.println("sayi3="+sayi3); // 99
        System.out.println("harf2="+harf2); // b






    }
}
